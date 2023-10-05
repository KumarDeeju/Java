import java.util.Scanner;
public class Pripinsta17a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int decimal = sc.nextInt();

        String Hexa = Integer.toHexString(decimal);

        System.out.print(Hexa);
    }
}
