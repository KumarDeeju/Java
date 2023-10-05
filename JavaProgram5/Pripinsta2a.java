import java.util.Scanner;

public class Pripinsta2a {
    static int sumOfFirstToEnd(int sum, int a, int b){
        // base case
        if(a > b) return sum;
        // recursive work/small work
        int smallAns = sumOfFirstToEnd(sum, a+1, b);
        // self work
        return a + smallAns;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = sumOfFirstToEnd(0, a, b);
        System.out.print(sum);
    }
}
