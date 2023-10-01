import java.util.Scanner;

public class FibonacciRev3 {
    static int mainFibonacci(int n){
       // base case
       if(n == 0 || n == 1) return n;
       // recursive work/small Answer
       int smallAns = mainFibonacci(n-2);
       // self work
       return (n-1) + smallAns; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=n;i++)
        System.out.println(mainFibonacci(i));
    }
}
