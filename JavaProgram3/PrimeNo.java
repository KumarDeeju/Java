import java.util.Scanner;
public class PrimeNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        // int temp = 0;
        for(i=1;i<n;i++){
            for(j=2;j<=i;j++){
                if(i%j==0){
                    break;  
                }
            }
            if(i==j)
            // temp = j;
            System.out.print(j+" ");
            
        }
        // System.out.print(temp);
            
    }
}