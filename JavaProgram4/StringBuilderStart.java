import java.util.Scanner;

public class StringBuilderStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String stg = sc.next();
        StringBuilder sb = new StringBuilder(str);
        sb.append(stg);
        System.out.print(sb);
    }
}
