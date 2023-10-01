import java.util.Scanner;

public class PripinstaDecimalToHexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Decimle = sc.nextInt();

        String Hexa = Integer.toHexString(Decimle);

        System.out.println(Hexa);
    }
}
