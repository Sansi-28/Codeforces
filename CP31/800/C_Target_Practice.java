import java.util.*;

public class C_Target_Practice {
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

        int n = 10;

        String [] arr = new String[n];

        for(int i = 0 ; i < n; i++){
            arr[i] = in.next();
        }

        int sum = 0;

        for(int i = 0; i < 5; i++){
            int j = 0;
            for(char c : arr[i].toCharArray()){
                if(c == 'X'){
                    
                    sum += Math.min(5 - Math.abs(i - 5 + 1), 5 - Math.abs(j - 5 + 1));
                }
                j++;
            }
        }


        System.out.println(sum);

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