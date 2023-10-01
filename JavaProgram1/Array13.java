import java.util.Scanner;
import java.util.Arrays;

public class Array13 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array value :");
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Array :");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\n Second array element :");
        for(int i=0;i<a.length;i++){
            b[i] = a[i];
            System.out.print(b[i]+" ");
        }
        

    }
}
