import java.util.Arrays;
import java.util.Scanner;

public class ArrayofLowBig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int size = sc.nextInt();
        int[] a = new int[size];
        
        System.out.println("Enter the Array : ");
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        
        Arrays.sort(a); // Arrays OF SORTED METHOD

        System.out.println("Array Sorted List : ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int sml = a[0];
        int big = a[a.length-1];
       
        System.out.println("Smallest Value : "+sml);
        System.out.println("BIgest Value : "+big);
    }
}
