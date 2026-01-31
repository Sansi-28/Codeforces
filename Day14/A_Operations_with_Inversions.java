import java.util.*;

public class A_Operations_with_Inversions{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); // if single test, replace with: int T = 1;
        while (T-- > 0) solve(in);
        in.close();
    }

    static void solve(Scanner in) {

        int n = in.nextInt();

        int [] a = readIntArray(in, n);

        Stack<Integer> stack = new Stack<>();


        for(int i = n-1; i >= 0; i--){
            if(stack.isEmpty()){
                stack.push(i);
            }else{
                while(!stack.isEmpty() && a[stack.peek()] < a[i]){
                    stack.pop();

                }

                stack.push(i);
            }
        }

        int s = stack.size();

        System.out.println(n-s);


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
