import java.util.Scanner;
public class devided {
    public static void main(String args[]){
        int m;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0){
           m = (n*(-1))%10;
           System.out.print(m);
        }else{
             System.out.println(n%10);

        }

    
    }
}
