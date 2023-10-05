import java.util.Scanner;

public class negativePosative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k = -n/2;
        for(int i=n/2;i>=k;i--){
            System.out.print(i+" ");
        }
    }
}
