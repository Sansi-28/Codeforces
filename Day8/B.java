package Day8;

import java.util.Scanner;

public class B {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int len = sc.nextInt();

            int[] arr = new int [len];
            int maxIndx = 0;
            

            for(int i = 0; i < len; i++){
                arr[i] = sc.nextInt();
                if(arr[maxIndx] < arr[i]){
                    maxIndx = i;
                }

            }

            System.out.println(maxIndx);

            
            int prev = arr[0], sum = 0;

            if(maxIndx == 0){
                prev = arr[1];
            }
            for(int i = 0; i < len; i++){
                if(i == maxIndx)continue;
                sum = sum + Math.abs(arr[i] - prev);
                prev = arr[i];
            }

            System.out.println(sum);
        }
    }
    
}
