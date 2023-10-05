import java.util.Scanner;

public class PripinstaMaximumHandsake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double MaximumHandsake = (n * (n-1)) / 2;

        System.out.println(MaximumHandsake);
    }
}
