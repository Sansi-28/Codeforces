import java.util.*;

public class A_Make_it_Beautiful {
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
        int [] a = readIntArray(in, n);

        int maxCount = 0;

        int max = 0;

        for(int i = 0; i < n; i++){

            max = (a[i] > a[max]) ? i : max;
        }

        int notMax = 0;

        for(int i = 0; i < n; i++){

            if(a[max] == a[i]){
                maxCount++;
            }else{
                notMax = i;
            }
        }

        if(maxCount > 1 && maxCount != a.length){
            System.out.println("YES");
            System.out.print(max + " ");
            System.out.println(a[notMax] + " ");
            for(int i = 0; i < n; i++){
                if(notMax != i && max != i){
                    System.out.print(a[i] + " ");
                }
            }
            System.out.println();
        }else{
            System.out.println("NO");
        }





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