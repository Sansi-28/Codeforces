import java.util.*;

public class B_Optimal_Shifts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); // if single test, replace with: int T = 1;
        while (T-- > 0) solve(in);
        in.close();
    }

    static void solve(Scanner in) {

        int n = in.nextInt();

        in.nextLine();

        String s  = in.nextLine();

        int count = 0;

        int countMax = 0;

        for(int i = 0; i < 2*n; i++){
            char c = s.charAt(i%n);

            if(c == '1'){
                if(count > countMax){
                    countMax = count;
                }
                count = 0;
            }else{
                count++;
            }
        }

        System.out.println(countMax);
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
