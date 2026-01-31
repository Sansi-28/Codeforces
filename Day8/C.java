package Day8;

import java.util.Scanner;
import java.util.Arrays;

public class C {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int len =  sc.nextInt();

            int [] arr = new int [len];

            for(int i = 0; i < len; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int diff = arr[1] - arr[0];

            if(diff >= arr[0]){
                System.out.println(diff);
            }else{
                System.out.println(arr[0]);
            }


        }
    }
    
}
