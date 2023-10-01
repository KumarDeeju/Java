import java.util.Scanner;

public class PripinstaOctalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Octal = sc.next();

        int Decimle = Integer.parseInt(Octal, 8);

        System.out.println(Decimle);

        String Binary = Integer.toBinaryString(Decimle);

        System.out.println(Binary);

    }
}
