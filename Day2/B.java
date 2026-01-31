package Day2;

import java.util.Scanner;

/* This is the easy version of the problem. The only difference between the easy and hard versions is that in the easy version, ai,bi≤1

.

Renako is stuck between a rock and a hard place... and by that, of course, I mean Ajisai and Mai! Both of them want to hang out with her, and she just can't decide! So Ajisai and Mai have decided to play the XOR game.

Ajisai and Mai are given arrays a
and b of length n (0≤ai,bi≤1). They will play a game that lasts for n turns, where Ajisai moves on odd-numbered turns and Mai moves on even-numbered turns. On the i-th turn, the player to move may choose to swap ai and bi

, or pass.

Note that if a swap occurs, the index that is being swapped must match the turn number. For example, on the first turn, Ajisai may choose to swap a1
and b1, or pass. On the second turn, Mai may choose to swap a2 and b2, or pass. This continues for n

turns. Thus, only Ajisai can swap odd indices, and only Mai can swap even indices.

At the end of the game, Ajisai achieves a score of a1⊕a2⊕⋯⊕an
, and Mai achieves a score of b1⊕b2⊕⋯⊕bn∗

. The player with the higher score wins. If the players have the same score, the game ends in a tie.

Determine the outcome of the game with optimal play. More formally, one player is considered to win with optimal play if there exists a strategy for them such that they always win, regardless of their opponent's choices. The game is considered a tie with optimal play if neither player has such a strategy.

∗
⊕

denotes the bitwise XOR operation
Input

The first line contains a single integer t
(1≤t≤104

)  — the number of test cases.

The first line of each test case contains a single integer n
(1≤n≤2⋅105

).

The second line of each test case contains n
integers, a1,a2,…,an (0≤ai≤1

).

The third line of each test case contains n
integers, b1,b2,…,bn (0≤bi≤1

).

It is guaranteed that the sum of n
over all test cases does not exceed 2⋅105

.
Output

For each test case, output on a single line "Ajisai" if Ajisai wins with optimal play, "Mai" if Mai wins with optimal play, or "Tie" if the game ends in a tie with optimal play.

You may output the answer in any case (upper or lower). For example, the strings "mAi", "mai", "MAI", and "maI" will be recognized as "Mai".
Example
Input
Copy

6
4
1 0 0 1
1 0 1 1
6
0 1 1 1 1 0
0 0 1 0 1 1
4
0 0 1 0
1 0 1 1
5
1 0 1 1 1
0 1 1 1 0
6
1 1 1 1 1 1
1 1 1 1 1 1
5
0 1 0 0 1
1 0 0 1 1

Output
Copy

Ajisai
Mai
Tie
Ajisai
Tie
Mai

Note

In the first example, one way the game might play out is as follows:

On turn 1, Ajisai chooses to swap a1
and b1. Now the arrays are a=[1,0,0,1] and b=[1,0,1,1]

.

On turn 2, Mai chooses to pass.

On turn 3, Ajisai chooses to swap a3
and b3. Now the arrays are a=[1,0,1,1] and b=[1,0,0,1]

.

On turn 4, Mai chooses to swap a4
and b4. Now the arrays are a=[1,0,1,1] and b=[1,0,0,1]

.

Now, Ajisai's final score is 1⊕0⊕1⊕1=1
and Mai's final score is 1⊕0⊕0⊕1=0

. Therefore, Ajisai wins the game.

It is not guaranteed that the above description is representative of optimal play.*/

public class B {

    private static void solve(int[] a, int [] b){
        boolean Ajisai = false;
        boolean Mai = false;

        int counta = 0, countb = 0;

        int n = a.length;

        for(int i = 0; i < n; i++){
            if(!Ajisai && (i+1)%2 != 0 &&  a[i] != b[i]){
                Ajisai = true;
            }

            if(!Mai && (i+1)%2 == 0 && a[i] != b[i]){
                Mai = true;
            }

            if(i % 2 != 0 && a[i] == 1){
                counta++;
            }
            if(i % 2 == 0 && b[i] == 1){
                countb++;
            }
        }

        if(Ajisai || counta % 2 != 0){
            if(Mai || countb % 2 != 0){
                System.out.println("tie");
            }else{
                System.out.println("Ajisai");
            }
        }else if (Mai || countb % 2 != 0){
            System.out.println("Mai");
        }else{
            System.out.println("tie");
        }
    }

    public static void main(String[] args) {
        
        int t;

        Scanner sc = new Scanner(System.in);
        
        t = sc.nextInt();

        while (t-- > 0) {
            int n;
            n = sc.nextInt();

            int [] a = new int[n];
            int [] b = new int [n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            for(int i = 0; i < n; i++){
                b[i] = sc.nextInt();
            }

            solve(a, b);
        }

        
    }
    
}
