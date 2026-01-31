import java.util.*;
import java.util.Scanner;

public class B {

    static List<Long> list;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); // if single test, replace with: int T = 1;
        while (T-- > 0) solve(in);
        in.close();
    }

    static void helper(String str, int indx, String sb){

        if(indx >= str.length())return;

        // if(str == null) return;

        
            
        

        if(indx != 0){

        long n = Long.parseLong(str);

        long x = Long.parseLong(sb);

        int pow = str.length() - sb.length();

        long y = (long)x * (long)Math.pow(10, pow);

        if(x+y == n )
        {
            list.add(x);
        }
            helper(str, indx+1, sb + '0');

        }
        helper(str, indx+1, sb + str.charAt(indx));

        

    }

/*
	write your logic here:
    recursion

*/

    static void solve(Scanner in) {

        long n = in.nextLong();

        String str = Long.toString(n);

        list = new ArrayList<>();

        helper(str, 0, "");

        System.out.println(list.size());

        

        for(int i = list.size() - 1; i >= 0; i--){
            System.out.print(list.get(i) + " ");
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
