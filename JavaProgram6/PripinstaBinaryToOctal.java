import java.util.Scanner;

public class PripinstaBinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Binary = sc.next();

        int Decimal = Integer.parseInt(Binary, 2);
        System.out.println(Decimal);

        String Octal = Integer.toOctalString(Decimal);
        

        System.out.println(Octal);
    }
}
