import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        int c = Integer.valueOf(a);
        int d = Integer.valueOf(b);

        int multiple =  c * d;
        System.out.println(multiple);
    }
}
