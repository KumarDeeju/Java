import java.util.Scanner;

public class FindFactor {
    
    // Function to calculate the factorial of a number
    static int factorial(int num) {
        if (num == 0 || num == 1)
            return 1;
        else
            return num * factorial(num - 1);
    }
    // Function to check if a number is a strong number
    static boolean isStrongNumber(int num) {
        int originalNum = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum == originalNum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input upper limit: ");
        int n = scanner.nextInt();
        
        System.out.println("Strong numbers between 1-" + n + ":");
        
        for (int i = 1; i <= n; i++) {
            if (isStrongNumber(i)) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}