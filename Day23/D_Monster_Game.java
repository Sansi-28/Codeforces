import java.util.*;

public class D_Monster_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }

        sc.close();
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int[] b = new int[n];
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();

        Arrays.sort(a);

        long mx = 0, sum = 0;
        int lvl = 0;

        for (int i = 1; i <= n; i++) {
            while (lvl < n && sum + b[lvl] <= i) {
                sum += b[lvl];
                lvl++;
            }

            long dif = a[n - i];
            long scr = dif * lvl;
            if (scr > mx) mx = scr;
        }

        System.out.println(mx);
    }
}
