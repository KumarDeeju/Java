import java.util.Scanner;
public class PripinstaOctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  str = sc.next();

        int Decimal = Integer.parseInt(str, 8);

        System.out.print(Decimal);
    }
}
