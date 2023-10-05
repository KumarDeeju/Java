import java.util.Scanner;
public class Pripinsta13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int Power = sc.nextInt();

        double ans = Math.pow(base, Power);

        System.out.print(ans);
    }
}
