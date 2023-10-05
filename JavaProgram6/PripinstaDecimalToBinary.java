import java.util.Scanner;

public class PripinstaDecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Decimal = sc.nextInt();

        String Binary = Integer.toBinaryString(Decimal);

        System.out.println(Binary);
    }
}
