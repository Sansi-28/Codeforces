import java.util.Scanner;

public class A {
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

        int len_a = in.nextInt();

        in.nextLine();

        String a = in.nextLine();

        int b_len = in.nextInt();

        in.nextLine();

        String b = in.nextLine();

        String str = in.nextLine();

        StringBuilder sb = new StringBuilder(a);

        for(int i = 0; i < b_len; i++){

            if(str.charAt(i) == 'D'){
                sb.insert(sb.length(), b.charAt(i));
            }else{
                sb.insert(0, b.charAt(i));
            }

        }

        System.out.println(sb.toString());
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
