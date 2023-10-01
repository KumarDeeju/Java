import java.util.Scanner;

public class DigitOfPower {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        
        System.out.print("Enter the base: ");
        int base = scanner.nextInt();
        
        int result = lastDigitOfPower(base, exponent);
        System.out.println("Result: " + result);
    }
    
    public static int lastDigitOfPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        
        int[] lastDigits = {0, 1, 4, 7, 6, 5, 6, 9, 4, 1};
        int lastDigit = lastDigits[base % 10];
        
        int cycleLength = lastDigits.length - 1;
        int exponentModCycle = exponent % cycleLength;
        
        if (exponentModCycle == 0) {
            exponentModCycle = cycleLength;
        }
        
        return (int) Math.pow(lastDigit, exponentModCycle) % 10;
    }
}
