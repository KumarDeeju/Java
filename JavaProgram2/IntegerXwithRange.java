import java.util.Scanner;
public class IntegerXwithRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases    
        for (int t = 0; t < T; t++) {
            int X = scanner.nextInt(); // Digit to count
            int L = scanner.nextInt(); // Lower bound
            int U = scanner.nextInt(); // Upper bound           
            int count = countDigitFrequency(X, L, U);
            System.out.println(count);
        }
        scanner.close();
    }
    public static int countDigitFrequency(int X, int L, int U) {
        int count = 0;
        for (int num = L + 1; num < U; num++) {
            count += countOccurrences(X, num);
        }
        return count;
    }
    public static int countOccurrences(int digit, int number) {
        int count = 0;
        while (number > 0) {
            if (number % 10 == digit) {
                count++;
            }
            number /= 10;
        }
        return count;
    }
}

