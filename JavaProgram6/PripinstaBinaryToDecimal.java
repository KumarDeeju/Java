import java.util.Scanner;
public class PripinstaBinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Binary = sc.next();

        int decimal = Integer.parseInt(Binary, 2);

        System.out.println(decimal);
    }
}
