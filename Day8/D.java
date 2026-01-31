package Day8;

import java.util.Scanner;

public class D {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int len = (int)Math.pow(2, n);
            int [] arr = new int [len];

            int indx = 0;

            boolean [] visited = new boolean [len];

            for(int i = 0; i < n; i++){
                arr[indx++] = (int)Math.pow(2, n-i) - 1;
                visited[(int)Math.pow(2, n-i) - 1] = true;
            }

            for(int i = 0; i < len; i++){
                if(!visited[i] && i % 2 != 0){
                    arr[indx++] = i;
                }
            }

            for(int i = 0; i < len; i++){
                if(!visited[i] && i % 2 == 0){
                    arr[indx++] = i;
                }
            }

            for(int i = 0; i < len; i++){
                System.out.print(arr[i] + " ");
            }

            System.out.println();

        }
    }
}
