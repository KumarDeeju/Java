import java.util.*;
class Factorial {
    public static void PrintFactorial(int n){
        // negative value for
        if(n<0){
            System.out.println("Invilid Number");
            return;
        }
        int factorial = 1;

        for(int i=n;i>=1;i--){
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }


        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            PrintFactorial(n);
        }
}