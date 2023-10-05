import java.util.Scanner;
public class Pripinsta11b {
    static int Fibonacci(int n){
        // basic case
        if(n == 0 || n == 1) return n;
        // recursive case / self work
        
        
        return Fibonacci(n-2) + Fibonacci(n-1); 
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
        System.out.println(Fibonacci(i));
        }
    }
}
