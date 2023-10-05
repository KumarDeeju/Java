import java.util.Scanner;
public class StringFIndWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sub = sc.nextLine();
        String str = sc.next();
        int i = sub.indexOf(str);
        System.out.println(i);
    }
}
