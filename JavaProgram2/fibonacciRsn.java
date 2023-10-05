import java.util.Scanner;

public class fibonacciRsn {
    static int fibonacci(int Fibc){
    // base case
        if(Fibc == 0 || Fibc == 1) return Fibc;
        // recursive work
        int smallAns = fibonacci(Fibc-2);
        // self work
        return smallAns + fibonacci(Fibc-1);

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Fibc = sc.nextInt();
        for(int i=0;i<=Fibc;i++)
        System.out.println(fibonacci(i));
    }
}
