import java.util.*;
public class FibonacciAndPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> primeNumbers = new ArrayList<>();
        List<Integer> fibonacciNumbers = new ArrayList<>();
        int num = 2;
        while (primeNumbers.size() < N) {
            if (isPrime(num)) {
                primeNumbers.add(num);
            }
            num++;
        }
        for (int i = 0; i < N; i++) {
            fibonacciNumbers.add(fibonacci(i));
        }
        for (int i = 0; i < N; i++) {
            System.out.print(primeNumbers.get(i) + " " + fibonacciNumbers.get(i) + " ");
        }
        scanner.close();
    }
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    private static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int prev = 0;
        int current = 1;
        for (int i = 2; i <= n; i++) {
            int next = prev + current;
            prev = current;
            current = next;
        }
        return current;
    }
}

