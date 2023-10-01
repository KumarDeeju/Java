import java.util.Scanner;

public class SplitTheComaCurlibrases {
    public static void main(String[] args) {
        
            String str = "{{3,2,1,5},{9,1,3,0}}";
            String str1 = str.replaceAll("[{,]"," ");
            String[] ans = str1.split("}");
        
                 for(String finl : ans){
                    String last = finl.trim();
            System.out.println(last);
         }
           
        
    }
}
