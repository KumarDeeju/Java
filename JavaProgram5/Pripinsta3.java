import java.util.Scanner;
// Method 3: Using inbuilt max Function
public class Pripinsta3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = Math.max(a, b);
        System.out.print(ans);
    }
}
