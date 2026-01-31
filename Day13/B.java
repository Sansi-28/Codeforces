package Day13;

import java.util.Scanner;

public class B {


    private static boolean isValid(String[] matrix){

        int n = matrix.length;

        for(int j = 0; j < n; j++){
            String str = matrix[j];
            for(int i = 0; i < n - 2; i++){
                if(str.substring(i, i+3).equals("###") || str.substring(i, i+3).equals("#.#")){
                    return false;
                } 
            }
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j < n-2; j++){
                char c1 = matrix[j].charAt(i);
                char c2 = matrix[j+1].charAt(i);
                char c3 = matrix[j+2].charAt(i);

                if((c1 == '#' && c2 == '.' && c3 == '#')|| (c1 == '#' && c2 == '#' && c3 == '#')){
                    return false;
                }
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int len = sc.nextInt();
            sc.nextLine();

            String[] matrix = new String[len];

            
            for(int i = 0; i < len; i++){
                matrix[i] = sc.nextLine();
            }

            if(isValid(matrix)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }


        }
    }
    
}
