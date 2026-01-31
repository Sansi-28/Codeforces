package Day12;

import java.util.Scanner;

public class B {
    

       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // sc.nextLine(); // consume newline

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int l = (a>b) ? a : b;
            int s = a+b - l;

            int sumA = 0, sumB = 0, count = 0, prod = 1;
            
            while((sumA <= l && sumB <= l)&& (sumA <= s || sumB <= s)){
                if(count == 0){
                    prod = 1;
                }else{
                    prod *= 2;
                }
                

                if(count % 2 == 0){
                    sumA += prod;
                }else{
                    sumB += prod;
                }

                count++;
            }

            System.out.println(count-1);
        }

        sc.close();
    }
}
