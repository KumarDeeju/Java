import java.util.Scanner;

public class PripinstaDecimalToOcta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Decimal = sc.nextInt();

        String Octa = Integer.toOctalString(Decimal);

        System.out.println(Octa);
    }
}
