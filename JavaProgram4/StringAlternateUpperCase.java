import java.util.Scanner;

public class StringAlternateUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String mp;
        for(int i=0;i<st.length();i+=2){
             mp = i.toUpperCase();
        }
        System.out.print(mp);
    }
}
