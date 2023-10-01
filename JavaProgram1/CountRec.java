import java.util.Scanner;

public class CountRec {
    static void Counting(int n){
        // bace case
        if(n == 1) {
            //System.out.println(n);
            return;
        }
        // recursive work/small work
        Counting(n-1);
        // self work
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        Counting(count);
    }
}
