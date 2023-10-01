import java.util.Scanner;

public class PatternReverseTry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int num = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++);
            }
            System.out.println();
        }
        
        num = N - 1;
        for (int i = N - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++);
            }
            System.out.println();
        }
    }
}