import java.util.Scanner;

public class AddSubSol {
    static int AlternatAns(int n){
        if(n == 0) return 0;
        if(n % 2 ==0 ) {
            return AlternatAns(n-1) - n;
        }else {
            return AlternatAns(n-1) + n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(AlternatAns(n));
    }
}
