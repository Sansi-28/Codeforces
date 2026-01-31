package Day12;

import java.util.Scanner;

public class C {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int len = sc.nextInt();

            int [] a = new int [len];
            int [] b = new int [len];
            int [] c = new int [len];


            for(int i = 0; i < len; i++){
                a[i] = sc.nextInt(); 
            }

            for(int i = 0; i < len; i++){
                b[i] = sc.nextInt(); 
            }

            for(int i = 0; i < len; i++){
                c[i] = sc.nextInt(); 
            }

            int countA = 0;
            
            for(int i = 0; i < len; i++){
                boolean flag = true;
                for(int j = 0; j<len; j++){
                    if(a[j] >= b[(i+j)%len]){
                        flag = false;
                        break;
                    }
                }

                if(flag){
                    countA++;
                }
            }


            System.out.println(countA);

            


            int countB = 0;
            for(int i = 0; i < len; i++){
                boolean flag = true;
                for(int j = 0; j<len; j++){
                    if(b[j] >= c[(i+j)%len]){
                        flag = false;
                        break;
                    }
                }

                if(flag){
                    countB++;
                }
            }

            System.out.println(countB);

            System.out.println((long)(len*countA*countB));
        }

        sc.close();
    }


    
}
