import java.util.Scanner;
import java.util.ArrayList;

public class C_Sorting_Game {

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); 
        while (T-- > 0) solve(in);
        in.close();
    }

    static void solve(Scanner in) {
        int n = in.nextInt();
        String s = in.next();

        int zeros = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') zeros++;
        }

        ArrayList<Integer> idx = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char target = (i < zeros) ? '0' : '1';
            
            if (s.charAt(i) != target) {
                idx.add(i + 1);
            }
        }

        if (idx.isEmpty()) {

            System.out.println("Bob");

        } else {

            System.out.println("Alice");

            System.out.println(idx.size());

            for (int i = 0; i < idx.size(); i++) {
                
                System.out.print(idx.get(i) + (i == idx.size() - 1 ? "" : " "));
            }
            System.out.println();
        }
    }
}