import java.util.Scanner;

public class PatternAlphabetNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i=i-2){
            int k = 1;
            char c = 'A';
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
            for(int j=1;j<=i-1;j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}
