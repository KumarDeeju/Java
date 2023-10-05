import java.util.Scanner;

public class StringLowerToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        for(int i=0;i<str.length();i++){
            boolean check = true;
            char ch = str.charAt(i);
            if(ch == ' '){
                continue;
            }
            int asci = (int)ch;
            if(asci>=97) check = false;
            if(check == true){
                asci += 32;
                char dh = (char)asci;
                str = str.substring(0, i) + dh + str.substring(i+1);
            }else{
                asci -= 32;
                char dh = (char)asci;
                str = str.substring(0, i) + dh + str.substring(i+1);
            }
        }
        System.out.print(str);
    }
}
