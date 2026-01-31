package Day13;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int r_0 = sc.nextInt();
            int x = sc.nextInt();
            int d = sc.nextInt();
            int n = sc.nextInt();
            
            sc.nextLine();

            String s = sc.nextLine();
            
            int count = 0;

            for(int i = 0; i < n; i++){
                char c = s.charAt(i);

                if(c == '1'){
                    r_0 -= d;
                    count++;
                }else{
                    if(r_0 < x){
                        r_0 -= d;
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }
    
}
