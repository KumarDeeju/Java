import java.util.Scanner;

public class StringMacthing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String sr = sc.next();
        String s = st.equalsIgnoreCase(sr) ? "Yes" : "No";
        System.out.println(s);
        
    }
}
