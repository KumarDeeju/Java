import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value :");
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Array Value :");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
            System.out.print("Array of Length :"+a.length);
    }
}
