// import java.util.HashMap;
import java.util.Scanner;

public class TwoStringFInd {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int count=0;
         String ans = "";
         for(int i=0;i<n;i++){
             String st = sc.next();
             String st1 = sc.next();
                char[] ch = st.toCharArray();
                char[] ch1 = st1.toCharArray();
           for(int j=0;j<ch.length;j++){ // i t v a c c o d i n g t e a m
            for(int k=0;k<(ch.length-ch1.length);k++){ // c a w
                if(ch[j] != ch[k]){
                    // count++;
                    ans += ch[i];
                // }else{
                }

            }
           }
            
        }
        System.out.println(count);
        System.out.println(ans);
    }
}
