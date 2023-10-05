import java.util.Scanner;
public class Pripinsta1a {

    static int sumOfNthNumber(int n){
        // base case
        if(n == 0) return n;
        // recursive work
        int smallAns = sumOfNthNumber(n-1);
        // self work
        return n + smallAns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = sumOfNthNumber(n);

        System.out.print(sum);
    }
}
