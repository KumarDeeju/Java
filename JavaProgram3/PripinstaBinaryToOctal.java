import java.util.Scanner;

public class PripinstaBinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Binary = sc.next();

        int Decimle = Integer.parseInt(Binary, 2);
        System.out.println(Decimle);

        String Octal = Integer.toOctalString(Decimle);
        System.out.println(Octal);
    }
}
