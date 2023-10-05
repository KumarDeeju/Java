import java.util.Scanner;

public class AddSubRec {
    static void AlternativSolve(int n){
        if( n == 0 ) return 0;
        if(n % 2 == 0) {
            return AlternativSolve(n-1) - n;
        }else {
            return AlternativSolve(n-1) + n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        AlternativSolve(n);
    }
}
