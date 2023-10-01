import java.util.Scanner;

public class PripinstaDecimalToBinary2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();

        String binary = Integer.toBinaryString(d);

        System.out.println(binary);
    }
}
