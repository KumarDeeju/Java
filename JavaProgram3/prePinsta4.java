import java.util.Scanner;
// Method 2 : Using Ternary Operator
public class prePinsta4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String ans = n%2 == 0 ? "This no is Even." : "This no is Odd.";
        System.out.print(ans);
    }
}
