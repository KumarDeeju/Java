import java.util.Scanner;
public class StringAllFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st.charAt(0));
        StringBuilder sb = new StringBuilder(st);
        // change between character
        sb.setCharAt(3, 'z');
        System.out.println(sb);
    }
}
