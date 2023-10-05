import java.util.Scanner;
// Method 2 : Using Formula for the Sum of Nth Term
public class FirstNaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int FirstNno = (n * (n + 1)) / 2;

        System.out.print(FirstNno);
    }
}
