import java.util.Scanner;

public class IntigerFirstAndLastSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // number of length (1234 = 234 ==> 1234 = 1000) . hear power is 1234 of 3.
        int power = (int) Math.log10(num);   
        int lastDigit = num % 10;
        // number ko power se devide karenge to (Bhagphal ayega digit ka first no) example- 1234 / 1000 = 1 times(means first digit)
        int firstDigit = (int) (num / Math.pow(10, power));
        // firstDigit me add karne ke liye usme power se multiply karenge
        int a = firstDigit * (int)Math.pow(10, power);
        int b = num % a; // last digit remove ke liye
        num = b / 10; // first digit remove ke liye
        num = (lastDigit * (int)Math.pow(10, power)) + num * 10 + firstDigit;
        System.out.println(num);
    }
}
