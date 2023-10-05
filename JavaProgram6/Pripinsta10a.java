import java.util.Scanner;
public class Pripinsta10a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
       
        String c = "";
        char cr = s.charAt(0);
         

        for(int i=s.length()-1;i>=s.charAt(0);i--){
             c += s.charAt(i);
        }
        System.out.print(c);
    }
}
