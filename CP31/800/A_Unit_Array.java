import java.util.*;

public class A_Unit_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); // if single test, replace with: int T = 1;
        while (T-- > 0) solve(in);
        in.close();
    }

/*
	write your logic here:

    no. if neg  -> odd even 
    sum < 0;



*/

    static void solve(Scanner in) {
        // example usage:
        // int n = in.nextInt();
        // int[] a = readIntArray(in, n);
        // System.out.println(answer);



        // ---- your solution starts here ----

        int n = in.nextInt();

        int [] a = readIntArray(in, n);

        double sum = 0;

        int countOfNeg = 0;

        for(int e : a){
            if(e == -1)countOfNeg++;
            sum += e;

        }

        if(sum < 0){
            countOfNeg = countOfNeg - (int)Math.ceil(Math.abs(sum)/2);
            if(countOfNeg % 2 == 0){
                System.out.println((int)Math.ceil(Math.abs(sum)/2));
            }else{
                System.out.println((int)Math.ceil(Math.abs(sum)/2) + 1);
            }
        }else{
            if(countOfNeg%2 == 0){
                System.out.println(0);
            }else{
                System.out.println(1);
            }
        }





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