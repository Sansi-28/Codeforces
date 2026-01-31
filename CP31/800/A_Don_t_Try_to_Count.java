import java.util.*;

public class A_Don_t_Try_to_Count{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); // if single test, replace with: int T = 1;
        while (T-- > 0) solve(in);
        in.close();
    }

/*
	write your logic here:
    -> create the string twice the length of the other
    -> check if you other string exist as a substring

*/

    static void solve(Scanner in) {

        int n = in.nextInt();

        int m = in.nextInt();

        String s1 = in.next();
        
        String s2 = in.next();

        int cnt = 0;
String cur = s1;

while (cur.length() <= 100*s2.length()) {
    if (cur.contains(s2)) {
        System.out.println(cnt);
        return;
    }
    cur += cur;
    cnt++;
}
System.out.println(-1);




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