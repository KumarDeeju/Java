import java.util.Scanner;
public class PripinstaDecimalToOcta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Decimle = sc.nextInt();

        String Octal = Integer.toOctalString(Decimle);

        System.out.println(Octal);
    }
}
