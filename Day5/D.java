package Day5;

import java.util.Scanner;


/*Let's call a number a binary decimal if it is a positive integer and all digits in its decimal notation are either 0 or 1. For example, 1010111 is a binary decimal, while 10201 and 787788

are not.

Given a number n
, you are asked whether or not it is possible to represent n

as a product of some (not necessarily distinct) binary decimals.
Input

The first line contains a single integer t
(1≤t≤5⋅104

) — the number of test cases.

The only line of each test case contains a single integer n
(1≤n≤105

).
Output

For each test case, output "YES" (without quotes) if n

can be represented as a product of binary decimals, and "NO" (without quotes) otherwise.

You can output "YES" and "NO" in any case (for example, strings "yES", "yes", and "Yes" will be recognized as a positive response).
Example
Input
Copy

11
121
1
14641
12221
10110
100000
99
112
2024
12421
1001

Output
Copy

YES
YES
YES
YES
YES
YES
NO
NO
NO
NO
YES

Note

The first five test cases can be represented as a product of binary decimals as follows:

    121=11×11

.
1=1
is already a binary decimal.
14641=11×11×11×11
.
12221=11×11×101
.
10110=10110
is already a binary decimal.  */

public class D {
    public static void main(String[] args) {

        int t;
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            solve(n);
        }
        
    }

    private static void solve(int n){

        int [] arr = {  10, 11,
                        100, 101, 111, 110, 
                        1000, 1001, 1010, 1011, 1100, 1101, 1110, 1111,
                        10000};
                    
        int temp = n;

        while (temp != 1){
            boolean flag = false;
            for(int i = arr.length -1; i>=0; i--){

                if(temp%arr[i] == 0){
                    temp = temp/arr[i];
                    flag = true;
                }

            }

            if(!flag)break;
        }

        if(temp == 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
