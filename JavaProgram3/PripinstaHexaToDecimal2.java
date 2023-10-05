import java.util.Scanner;

public class PripinstaHexaToDecimal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int decimal = Integer.parseInt(str, 16);

        System.out.println(decimal);
    }
}
