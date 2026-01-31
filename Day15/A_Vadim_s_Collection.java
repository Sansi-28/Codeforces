import java.util.*;

public class A_Vadim_s_Collection {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        in.nextLine(); // if single test, replace with: int T = 1;
        while (T-- > 0) solve(in);
        in.close();
    }

/*
	write your logic here:
    is

*/

    static void solve(Scanner in) {

        

        // in.nextLine();

        String s = in.nextLine();
        int n = 10;

        boolean [] isVisited = new boolean[n];
        int [] nums = new int[n];

        for(int i = 0; i < n; i++){
            int  c = s.charAt(i) - '0';

            nums[i] = c;
        }

        Arrays.sort(nums);

        int [] ans = new int[n];

        for(int i = 0; i < 10; i++)
        {
            int val = 0;
            for(int j = 0; j < n; j++){
                if(nums[j] >= 10 - i - 1 && !isVisited[j]){
                    val = j;
                    isVisited[val] = true;
                    break;
                }
            }
            ans[i] = nums[val];
        }

        for(int i = 0; i < n; i++){
            System.out.print(ans[i]);
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
