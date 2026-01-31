import java.util.Scanner;

public class D_1_Sub_RBS_Easy_Version {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int tot = n / 2;
            int cur = 0;
            boolean f = false;
            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) == '(') cur++;
                if (s.charAt(i) == ')' && s.charAt(i + 1) == '(') {
                    if (tot - (cur + 1) > 0) {
                        f = true;
                        break;
                    }
                }
            }
            System.out.println(f ? n - 2 : -1);
        }
    }
}