import java.util.*;

public class A_Cover_in_Water {
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

        int count = 0;

        int sum = 0;

        for(char c : s.toCharArray()){
            if(c == '.'){
                count++;
            }else{
                if(count > 2){
                    sum = 2; break;
                }else{
                    sum += count;
                    count = 0;
                }
            }
        }
        if(count <= 2){
            sum += count;
        }else{
            sum = 2;
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