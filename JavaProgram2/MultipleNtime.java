import java.util.Scanner;

public class MultipleNtime {
    static void MultipleOfNtime(int n, int k){
        // base case
        //if(k == 0) return 1;
        if(k == 1) {
            System.out.println(n);
            return;
        }
        // recursive work/smallans(k-1)
        MultipleOfNtime(n, k-1);
        // self work
        System.out.println(n * k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        MultipleOfNtime(n, k);
    }
}
