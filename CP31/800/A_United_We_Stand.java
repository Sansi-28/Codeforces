import java.util.*;

public class A_United_We_Stand{
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

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){

            max = (max < a[i]) ? a[i] : max;
        }

        List<Integer> b = new ArrayList<>();
        
        List<Integer> c = new ArrayList<>();

        for(int e : a){
            if(e == max){
                c.add(e);
            }else{
                b.add(e);
            }
        }

        if(c.size() == a.length){
            System.out.println(-1);
            return;
        }

        System.out.println(b.size() + " " + c.size());

        
        for(Integer e : b){
            System.out.print(e + " ");
        }
        System.out.println();

        for(Integer e : c){
            System.out.print(e + " ");
        }
        System.out.println();

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