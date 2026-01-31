import java.util.*;
public class A_Halloumi_Boxes {
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

        int k = in.nextInt();



        int []  a = readIntArray(in, n);

        if(k <= 1){
            if(alreadySorted(a)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
        }else{
            System.out.println("YES");
        }


        // example usage:
        // int n = in.nextInt();
        // int[] a = readIntArray(in, n);
        // System.out.println(answer);

        // ---- your solution starts here ----
    }

    static boolean alreadySorted(int [] a){
        int n = a.length;
        for(int i = 1; i < n; i++){
            if(a[i-1] > a[i]){
                return false;
            }
        }

        return true;
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
