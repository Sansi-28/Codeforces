import java.util.Scanner;

public class A_Table_with_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            int l = sc.nextInt();
            
            int B = 0; 
            int M = 0;
            
            int min_hl = Math.min(h, l);
            int max_hl = Math.max(h, l);
            
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a <= min_hl) {
                    B++;
                } else if (a <= max_hl) {
                    M++;
                }
            }
            
            // Formula to calculate maximum possible pairs
            int maxPairs = (B + Math.min(B, M)) / 2;
            
            System.out.println(maxPairs);
        }
        sc.close();
    }
}