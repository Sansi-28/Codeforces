import java.util.Scanner;

public class B_Reverse_a_Permutation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] p = new int[n];
                int[] pos = new int[n + 1]; // To store index of each value
                
                for (int i = 0; i < n; i++) {
                    p[i] = sc.nextInt();
                    pos[p[i]] = i;
                }

                // Find first position that doesn't have the largest possible remaining value
                for (int i = 0; i < n; i++) {
                    int maxVal = n - i;
                    if (p[i] != maxVal) {
                        int k = pos[maxVal];
                        // Reverse segment from current position i to position k of maxVal
                        for (int l = i, r = k; l < r; l++, r--) {
                            int tmp = p[l];
                            p[l] = p[r];
                            p[r] = tmp;
                        }
                        break; // Exactly one operation
                    }
                }

                StringBuilder sb = new StringBuilder();
                for (int x : p) sb.append(x).append(" ");
                System.out.println(sb);
            }
        }
    }
}