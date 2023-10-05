import java.util.Scanner;

public class findPalindromLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String ss = "";
        String s1 = "";
        char[] ch = st.toCharArray();
        int len = st.length();
        String ans = st.substring(0, len);
        

        // for(int i=0;i<ch.length;i++){ // a 
        //     for(int j=i+1;j<ch.length;j++){ // b c
        //         if(ch[i] == ch[j]){
        //             ss += ch[i];
        //         }else{
        //             s1 += ch[i];
        //         }
        //     }
        // }
        // System.out.println(ss);
        // System.out.println(s1);
    }
}
