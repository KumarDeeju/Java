import java.util.Scanner;

public class Shift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = n>>2;
        System.out.print(ans);
    }
}
