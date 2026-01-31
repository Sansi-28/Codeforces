package Day10;

import java.util.*;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int k = sc.nextInt();

            int n = sc.nextInt();

            for(int i = 0; i < k; i++){
                n = n*2;
            }

            System.out.println(n);
        }
    }
    
}