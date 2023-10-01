import java.util.Scanner;

public class PatternNumStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j>1)
                System.out.print(" *"+j);
                else
                System.out.print(1);
            }
            System.out.println();
        }
        // Botumn side
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(j>1)
                System.out.print(" *"+j);
                else
                System.out.print(1);
            }
            System.out.println();
        }
    }
}
