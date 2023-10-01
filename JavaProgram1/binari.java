import java.util.Scanner;

public class binari {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int r = n/10;
        int k = n%10;
        if(r==0 || k==1 || r==1 || k==0){
            System.out.print("yes");
        }else{
            System.out.print("No");
        }
    }
}
