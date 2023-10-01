import java.util.Scanner;

public class PatternAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=n;i>=1;i--){
            char c = 'A';
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;
            }
            // for space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
               // Right side   
               for(int j=1;j<=n-i+1;j++){
                   
                   System.out.print(c);
                   c--;
                }
                System.out.println();
                
        }
    }
}
