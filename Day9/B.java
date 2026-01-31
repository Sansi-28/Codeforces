package Day9;

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

            
            int sum = 0, prev = arr[0]
            for(int i = 0; i < len; i++){
                
            }
            

            if(sum < 0){
                if(arr[len-1] == -1){
                    arr[len-1] = Math.abs(sum);
                    sum = 0;
                }
            }

            if(sum > 0){
                if(arr[0] == -1){
                    arr[0] = sum;
                    sum = 0;
                }
            }

            System.out.println(sum);

            for(int i = 0; i < len; i++){
                // arr[i] = sc.nextInt();
                if(arr[i] == -1){
                    System.out.print(0 + " ");
                }else{
                    System.out.print(arr[i] + " ");
                }
            }

            System.out.println();

        }
    }
    
}
