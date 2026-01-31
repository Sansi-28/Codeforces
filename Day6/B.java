package Day6;

import java.util.Scanner;

/*Given an array c, let f(c) be the number of distinct elements in c. For example, f([1,2,2])=2 because there are two distinct elements in [1,2,2]: 1 and 2. Also, define c[i,j] as the subarray∗ of c bounded by positions i and j (that is, the array [ci,ci+1,…,cj]

).

There is an array a
of size n. An array b of n elements is constructed such that bi=f(a[1,i])+f(a[2,i])+…+f(a[i,i]). You are given the array b. Find any possible a with elements 1≤ai≤n. It is guaranteed that at least one possible a

exists.

∗
An array x is a subarray of an array y if x can be obtained from y

by the deletion of several (possibly, zero or all) elements from the beginning and several (possibly, zero or all) elements from the end.
Input

Each test contains multiple test cases. The first line contains the number of test cases t
(1≤t≤104

). The description of the test cases follows.

The first line of each test case contains an integer n
(1≤n≤105) – the number of elements in a and b

.

The second line of each test case contains n
integers b1,b2,…,bn (1≤bi≤1018

).

It is guaranteed that the sum of n
over all test cases does not exceed 105

.
Output

For each test case, print any possible a
on a new line. The array a should satisfy 1≤ai≤n

.

For every test case, it is guaranteed at least one a

that satisfies the conditions exists.
Example
Input
Copy

4
3
1 3 6
3
1 3 5
3
1 3 4
4
1 2 3 7

Output
Copy

1 3 2
2 3 2
3 2 2
4 4 4 1

Note

Let's verify our output for the second test case is correct:

    b1=f([2])=1

b2=f([2,3])+f([3])=2+1=3
b3=f([2,3,2])+f([3,2])+f([2])=2+2+1=5 */

public class B {
    private static void solve(long [] b){
        int num = 1, n = b.length;
        int [] a = new int [n];
        for(int i = 0; i < n; i++){
            if(i == 0){
                a[i] = 1;

            }else{
                long val = i + b[i-1] - b[i];

                if(val < 0){
                    a[i] = ++num;
                }else{
                    a[i] = a[(int)val];
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();

            long [] b = new long [n];

            for(int i = 0; i < n; i++){
                b[i] = sc.nextLong();
            }

            solve(b);

            System.out.println();
        }
    }
}
