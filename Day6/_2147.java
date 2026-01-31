package Day6;

import java.util.Scanner;

public class _2147 {

     static final long MOD = 1000000009L;

    private static int solve(String corridor){

        long s_count = 0, p_count = 0,  n = corridor.length(), check = 0;

        long prod = 1;
        
        for(int i = 0; i < n; i++){
            if(s_count > 1){
                if(corridor.charAt(i) == 'S'){
                    s_count = 1;
                    prod = (prod * (p_count + 1))%MOD;
                    p_count = 0;
                }else{
                    p_count++;
                }
            }else{
                if(corridor.charAt(i) == 'S'){
                        s_count++;
                }
            }

            if(corridor.charAt(i) == 'S')check++;
        }

        if(check%2 != 0 || check == 0)return 0;

        return (int)(prod % MOD);
    
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String corridor = sc.nextLine();

        System.out.println(solve(corridor));
    }

    
}
