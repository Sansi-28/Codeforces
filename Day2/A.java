package Day2;

import java.util.Scanner;


/*You are given an integer n. Your task is to construct an array of length 2⋅n

such that:

    Each integer from 1

to n
appears exactly twice in the array.
For each integer x
(1≤x≤n), the distance between the two occurrences of x is a multiple of x. In other words, if px and qx are the indices of the two occurrences of x, |qx−px| must be divisible by x

    . 

It can be shown that a solution always exists.
Input

Each test contains multiple test cases. The first line contains the number of test cases t
(1≤t≤104

). The description of the test cases follows.

Each of the next t
lines contains a single integer n (1≤n≤2⋅105

).

It is guaranteed that the sum of n
over all test cases does not exceed 2⋅105

.
Output

For each test case, print a line containing 2⋅n

integers — the array that satisfies the given conditions.

If there are multiple valid answers, print any of them.
Example
Input
Copy

3
2
3
1

Output
Copy

1 2 1 2
1 3 1 2 3 2
1 1

Note

Visualizer link

In the first test case:

    The number 1

appears at positions 1 and 3: the distance is 2, which is divisible by 1
.
The number 2
appears at positions 2 and 4: the distance is 2, which is divisible by 2

    . 

In the second test case:

    The number 1

appears at positions 1 and 3: the distance is 2, which is divisible by 1
.
The number 2
appears at positions 4 and 6: the distance is 2, which is divisible by 2
.
The number 3
appears at positions 2 and 5: the distance is 3, which is divisible by 3

    . 

In the third test case, the two occurrences of 1
are at positions 1 and 2, so the distance between them is 1, which is a multiple of 1. */

public class A {

    private static int [] solve(int n){
        int[] arr = new int [2*n];
        

        for(int i = 0; i < n; i++){

            if(i == 0){
                arr[i] = n-i;
                arr[n-i] = n-i;
            }else{
                arr[i] = n-i;
                arr[2*n - i] = n-i;
            }


        }

        for(int i = 0; i < 2*n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        return arr;

    }

    public static void main(String[] args) {

        int t;

        Scanner sc = new Scanner(System.in);


        t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();

            solve(n);
        }
        
    }
    
}
