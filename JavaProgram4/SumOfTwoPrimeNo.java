import java.util.Scanner;
public class SumOfTwoPrimeNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<n;i++){
            for(j=2;j<=i;j++){
                if(i%j==0){
                    break;
                }
            }
            if(i==j)
                 System.out.print(j+" ");
            
            }
            
    }
}