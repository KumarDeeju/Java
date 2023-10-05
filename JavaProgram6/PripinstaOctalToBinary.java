import java.util.Scanner;

public class PripinstaOctalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Octal = sc.next();

        int Decimal = Integer.parseInt(Octal, 8);

        System.out.println(Decimal);

        String Binary = Integer.toBinaryString(Decimal);

        System.out.println(Binary);

    }
}
