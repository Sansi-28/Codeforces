package Day10;

import java.util.*;

public class D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int len = sc.nextInt();

            int [] arr = new int [len];

            Map<Integer, Integer> mp = new HashMap<>();

            for(int i = 0; i < len; i++){
               arr[i] = sc.nextInt();
               mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
            }
            boolean valid = true;

            for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
                Integer key = entry.getKey();
                Integer value = entry.getValue();

                if(value % key != 0){
                    System.out.println(-1);
                    valid = false;
                    break;
                }

            }

            if(valid){
                for(int i = 0; i < len; i++){
                    System.out.print(arr[i] + " ");
                }

                System.out.println();

            }

            



            // System.out.println(n);
        }
    }
    
}
