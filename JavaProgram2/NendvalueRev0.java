import java.util.Scanner;

public class NendvalueRev0 {
    static void NOfEndValue(int n){
        // base case
        if(n == 1) {
            System.out.println(1);
            return;
        } // return n;
        // recursive case
        NOfEndValue(n-1);
        // self work
         System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NOfEndValue(n);
    }
}
