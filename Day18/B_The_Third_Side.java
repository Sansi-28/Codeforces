import java.util.PriorityQueue;
import java.util.Scanner;

public class B_The_Third_Side{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); // if single test, replace with: int T = 1;
        while (T-- > 0) solve(in);
        in.close();
    }

/*
	write your logic here:

    a + b

*/

    static void solve(Scanner in) {

        int n = in.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();


        for(int i = 0; i < n; i++){
            int temp = in.nextInt();
            pq.add(temp);
        }

        while(pq.size() != 1){
            int a = pq.poll();
            int b = pq.poll();

            pq.add(a + b - 1);
        }

        System.out.println(pq.poll());


        
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