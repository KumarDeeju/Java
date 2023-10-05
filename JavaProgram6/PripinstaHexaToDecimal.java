import java.util.Scanner;
public class PripinstaHexaToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Hexa = sc.next();

        int Decimal = Integer.parseInt(Hexa, 16);

        System.out.println(Decimal);
    }
}
