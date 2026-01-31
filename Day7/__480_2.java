package Day7;

import java.util.ArrayList;
import java.util.List;

public class __480_2 {

    static String solve (String s){
         List<String> res = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        int i = 0, n = s.length(), count = 0;
        while(s.charAt(i) != ' '){
            count++;
            sb.append(s.charAt(i));
        }

        StringBuilder result = new StringBuilder();

        res.add(sb.toString());

        sb.setLength(0);
        int temp = 0;
        while(i < n){

            char c = s.charAt(i);

            if(c == ' '){

                if(count == temp){
                    res.add(sb.reverse().toString());
                }else{
                     res.add(sb.toString());
                }

                System.out.println(sb.toString());

                temp = 0;

                sb.setLength(0);
                
                
            }else{

                if(c =='a'|| c == 'e'|| c == 'i'|| c == 'o'|| c == 'u'){
                    temp++;
                }
                sb.append(c);
            }

           i++;
        }

        for(i = 0; i < res.size(); i++){
                result.append(res.get(i));

                if(i != 0 && i != n){
                    result.append(" ");
                }
            }

         return result.toString();
    }

    public static void main(String[] args) {
        String str = "cat and mice";

        System.out.println(solve(str));
    }
}