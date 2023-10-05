import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        int i,n,Sum=0;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter N od value :");
       n = sc.nextInt();

       if(n%2 == 0){
            for(i=0;i<=n;i=i+2){
                Sum = Sum + i;
                
            }
            System.out.println("Even :"+Sum);
            }
            else {
                for(i=1;i<=n;i=i+2){
                    Sum = Sum + i;
                }
                System.out.println("odd Is :"+Sum);
       }
    } 
    
}
