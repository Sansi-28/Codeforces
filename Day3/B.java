package Day3;

import java.util.Scanner;

/*Monocarp has a deck of cards numbered from 1 to n. Initially, the cards are arranged from smallest to largest, with 1 on top and n

at the bottom.

Monocarp performed k

actions on the deck. Each action was one of three types:

    remove the top card;
    remove the bottom card;
    remove either the top or bottom card. 

Your task is to determine the fate of each card: whether it remains in the deck, has been removed, or might be both.
Input

The first line contains a single integer t
(1≤t≤104

) — the number of test cases.

The first line of each test case contains two integers n
and k (1≤k≤n≤2⋅105

).

The second line contains a string s
of length k, consisting of characters 0, 1, and/or {2}. This string describes Monocarp's actions. If the i-th character is 0, Monocarp removes the top card on the i

-th action. If it's 1, he removes the bottom card. If it's 2, either the top or bottom card can be removed.

Additional constraint on the input: the sum of n
over all test cases doesn't exceed 2⋅105

.
Output

For each test case, print a string consisting of n
characters. The i-th character should be + (plus sign) if the i

-th card is still in the deck, - (minus sign) if it has been removed, or ? (question mark) if its state is unknown.
Example
Input
Copy

4
4 2
01
3 2
22
1 1
2
7 5
01201

Output
Copy

-++-
???
-
--?+?--*/

public class B {

    private static void solve(int n, int k, String s) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < k; i++) {
            char c = s.charAt(i);
            if (c == '0') count0++;
            else if (c == '1') count1++;
            else count2++;
        }

        int minTop = count0;
        int maxTop = count0 + count2;
        int minBottom = count1;
        int maxBottom = count1 + count2; // not actually needed explicitly

        StringBuilder ans = new StringBuilder();

        for (int i = 1; i <= n; i++) { // i is 1-based card index

            // 1) Check if card i can survive in some scenario
            int lowerT = Math.max(minTop, k - n + i); // T >= k - (n - i + 1) + 1 = k - n + i
            int upperT = Math.min(maxTop, i - 1);     // T < i  => T <= i - 1

            boolean canSurvive = (lowerT <= upperT);

            // 2) Check if card i can be removed in some scenario

            // From top:
            boolean canRemovedTop = (maxTop >= i);

            // From bottom:
            // Need some T in [minTop, maxTop] with T <= k - (n - i + 1)
            int bound = k - (n - i + 1);
            boolean canRemovedBottom = (minTop <= bound);

            boolean canRemoved = canRemovedTop || canRemovedBottom;

            char ch;
            if (!canSurvive) {
                ch = '-';     // always removed
            } else if (!canRemoved) {
                ch = '+';     // always present
            } else {
                ch = '?';     // ambiguous
            }

            ans.append(ch);
        }

        System.out.println(ans.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next(); // length k

            solve(n, k, s);
        }

        sc.close();
    }
}
