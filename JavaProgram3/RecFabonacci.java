import java.util.Scanner;

public class RecFabonacci {
    static int printFibonacci(int n){
        if(n == 0) return 0;

        int ans = printFibonacci(n-2) + printFibonacci(n-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(printFibonacci(n));
       
    }
}
