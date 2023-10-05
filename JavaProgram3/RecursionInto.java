import java.util.Scanner;
public class RecursionInto {
    static void MulplicationElement(int n, int k){
        if( k == 1){  // base case
            System.out.println(n);
            return;
        }
        // small Solution
        MulplicationElement(n, k-1);
        // self work
        System.out.println(n * k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        MulplicationElement(n, k);
    }
}
