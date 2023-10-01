import java.util.Scanner;

public class PripinstaOctalToDecimal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Octal = sc.next();

        int decimal = Integer.parseInt(Octal, 8);

        System.out.println(decimal);
    }
}
