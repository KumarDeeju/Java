import java.util.Scanner;

public class PripinstaDecimalToHexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Decimal = sc.nextInt();

        String Hexa = Integer.toHexString(Decimal);

        System.out.println(Hexa);
    }
}
