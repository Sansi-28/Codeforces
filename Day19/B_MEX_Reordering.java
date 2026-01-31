import java.util.Scanner;

public class B_MEX_Reordering {

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); 
        while (T-- > 0) solve(in);
        in.close();
    }

    static void solve(Scanner in) {

        int n = in.nextInt();

        int[] c = new int[105];

        for (int i = 0; i < n; i++) {

            c[in.nextInt()]++;

        }

        int m = 0;
        
        while (c[m] > 0) m++;

        if (m == 0) {

            System.out.println("NO");

        } else if (m == 1) {

            System.out.println(c[0] == 1 ? "YES" : "NO");

        } else {

            System.out.println("YES");

        }
    }
}