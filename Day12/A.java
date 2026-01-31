package Day12;

import java.util.Scanner;

public class A {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
         // consume newline

        while (t-- > 0) {

            int len = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();

            boolean flag1 = false, flag2 = false;
             
            for(int i = 0; i <= s.length()- 4; i++){

                System.out.println(s.substring(i, i+4));
                if(s.substring(i, i+4).equals("2026")){

                    
                    flag1 = true;
                    break;
                }



            }

            for(int i = 0; i <= s.length()- 4; i++){
                System.out.println(s.substring(i, i+4));
                if(s.substring(i, i+4).equals("2025")){
                    flag2 = true;
                    break;
                }
            }

            if(!flag1 && flag2){
                System.out.println(1);
            }else{
                System.out.println(0);
            }



        }

        sc.close();
    }
    
    
}