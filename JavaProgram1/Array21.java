import java.util.Arrays;
import java.util.Scanner;

public class Array21 {
    public static void main(String[] args) {
        int a[] = new int[5];
         Scanner sc = new Scanner(System.in);
         System.out.println("entr the first value :");
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int a2[]=Arrays.copyOf(a,5);
        System.out.println("data in array 2 :");
        for(int i=0;i<a2.length;i++){
            System.out.print(a2[i]+" ");
        }
    }
}
