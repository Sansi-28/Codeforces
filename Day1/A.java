package Day1;

import java.util.Scanner;
import java.math.BigInteger;

/* You are given an integer n and an array a of length n

.

Find the smallest integer x
(2≤x≤1018) such that there exists an index i (1≤i≤n) with gcd∗(ai,x)=1. If no such x exists within the range [2,1018], output −1

.

∗
gcd(x,y) denotes the greatest common divisor (GCD) of integers x and y

.
Input

The first line contains a single integer t
(1≤t≤104

) — the number of test cases.

Each of the following t

test cases consists of two lines:

The first line contains a single integer n
(1≤n≤105

) — the length of the array.

The second line contains n
space-separated integers a1,a2,…,an (1≤ai≤1018

).

It is guaranteed that the total sum of n
across all test cases does not exceed 105

.
Output

For each test case, output a single integer: the smallest x
(2≤x≤1018) such that there exists an index i with gcd(ai,x)=1. If there is no such x in the range [2,1018], print −1

.
Example
Input
Copy

4
1
1
4
6 6 12 12
3
24 120 210
4
2 4 6 10

Output
Copy

2
5
5
3

Note

In the first test case, gcd(2,1)=1

, which is the smallest number satisfying the condition.

In the second test case:

    gcd(2,6)=2

, gcd(2,12)=2, so 2
cannot be the answer.
gcd(3,6)=3
, gcd(3,12)=3, so 3
cannot be the answer.
gcd(4,6)=2
, gcd(4,12)=4, so 4
cannot be the answer.
gcd(5,6)=1
, so the answer is 5

    . 

In the third test case:

    gcd(2,24)=2

, gcd(2,120)=2, gcd(2,210)=2, so 2
cannot be the answer.
gcd(3,24)=3
, gcd(3,120)=3, gcd(3,210)=3, so 3
cannot be the answer.
gcd(4,24)=4
, gcd(4,120)=4, gcd(4,210)=2, so 4
cannot be the answer.
gcd(5,24)=1
, so the answer is 5

    . 

In the fourth test case:

    gcd(2,2)=2

, gcd(2,4)=2, gcd(2,6)=2, gcd(2,10)=2, so 2
cannot be the answer.
gcd(3,2)=1
, so the answer is 3. */

// import java.util.*;
public class A {

    public static long gcd (long a, long b){
        return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).longValue();
    }


    public static void main(String[] args) {

        int t;

        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            
            long [] arr = new long [n];
            long gcd = 0;;
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextLong();
                if(i == 0) gcd = arr[0];
                if(i > 0){
                    gcd = gcd(gcd, arr[i]);
                }
            }
            int [] prime = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53};
            long x = -1;
            for(int i = 0; i < 16; i++ ){
                if(gcd%prime[i] != 0){
                    x=prime[i];
                    break;
                }
            }

            System.out.println(x);
        }

    }
}
