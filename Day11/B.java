package Day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        
        while (t-- > 0) {
            String r = sc.next();
            int n = r.length();

            List<Integer> sPos = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (r.charAt(i) == 's') sPos.add(i + 1);
            }

            sPos.add(1);
            sPos.add(n);

            Collections.sort(sPos);

            int ops = 0;

            if (r.charAt(0) != 's') ops++;
            if (r.charAt(n - 1) != 's') ops++;

            for (int i = 1; i < sPos.size(); i++) {
                int d = sPos.get(i) - sPos.get(i - 1);
                ops += (d - 1) / 2;
            }

            System.out.println(ops);
        }
        sc.close();
    }
    
}
