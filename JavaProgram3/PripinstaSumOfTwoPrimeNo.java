import java.util.Scanner;

public class PripinstaSumOfTwoPrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0,i,j;
        for(i=1;i<=n;i++){
            for(j=2;j<=i;j++){
                if(i % j == 0){
                    
                    break;
                }
                if(i==j){
                    System.out.print(j+" ");
                }
            }
        }
    }
}
