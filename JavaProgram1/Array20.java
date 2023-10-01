import java.util.Scanner;
import java.util.Arrays;

public class Array20 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int a2[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value :");
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("enter the second value ;");
        for(int i=0;i<a2.length;i++){
            a2[i] = sc.nextInt();
        }
        boolean b = Arrays.equals(a,a2);
        System.out.println("answer is :"+b);
    }
}
