import java.util.Scanner;

public class StringBuilderSt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(1, ch);
        System.out.print(sb);
    }
}
