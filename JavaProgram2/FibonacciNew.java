import java.util.Scanner;

public class FibonacciNew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = 0;
        int curnt = 1,fac;
        int num = 2;


        static boolean isPrime(int num){
            if(num <= 1){
                return false;
            }
            for(int i=2;i * i<=num;i++){
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }
      
        static int isFibonacci(int prev, int curnt, int fac ){
        for(int i=0;i<=n;i++){
            fac = prev + curnt;
            prev = curnt;
            curnt = fac;
        }
        return a;
    }

    }
}
