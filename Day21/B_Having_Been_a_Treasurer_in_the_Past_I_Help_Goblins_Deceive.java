import java.util.*;

public class B_Having_Been_a_Treasurer_in_the_Past_I_Help_Goblins_Deceive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); // if single test, replace with: int T = 1;
        while (T-- > 0) solve(in);
        in.close();
    }

/*
	write your logic here:

*/

    static void solve(Scanner in) {

        int n = in.nextInt();

        String s = in.next();

        if(s.length() < 3){
            System.out.println(0);
            return;
        }

        int c_ = 0;
        int c__ = 0;

        for(char c : s.toCharArray()){
            if(c == '_'){
                c__++;
            }else{
                c_++;
            }
        }

        int c_1 = 0;
        int c_2 = 0;

        if(c_%2 == 0){
            c_1 = c_/2;
            c_2 = c_1;
        }else{
            c_1 = c_/2;
            c_2 = c_1 + 1;
        }

        long res = (long)c_1 * c_2 * c__;

        System.out.println(res);
        // example usage:
        // int n = in.nextInt();
        // int[] a = readIntArray(in, n);
        // System.out.println(answer);

        // ---- your solution starts here ----
    }

    // tiny helpers
    static int[] readIntArray(Scanner in, int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        return a;
    }

    static long gcd(long a, long b) {
        while (b != 0) { long t = a % b; a = b; b = t; }
        return Math.abs(a);
    }
}