package Day10;

import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int len = sc.nextInt();

            int [] arr = new int [len];

            for(int i = 0; i < len; i++){
                arr[i] = sc.nextInt();
            }

            int [] ans = new int [len];

            for(int i = 0; i < len; i++){
                ans[i] = len + 1 - arr[i];
            }

            for(int i = 0; i < len; i++){
                System.out.print(ans[i] + " ");
            }

            System.out.println();
        }
    }
    
}
