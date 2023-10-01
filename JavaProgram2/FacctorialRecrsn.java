import java.util.Scanner;

public class FacctorialRecrsn {
    static int Factorial(int fact){
        // base case
        if(fact == 1) return 1;
        // recursive work/small ans
        int smallAns = Factorial(fact-1);
        // self work
        return smallAns * fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = sc.nextInt();
        System.out.println(Factorial(fact));
    }
}
