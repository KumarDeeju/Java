import java.util.Scanner;
public class forLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=n;i>=0;i -=m){
            System.out.print(i+" ");
        }
    }
}
