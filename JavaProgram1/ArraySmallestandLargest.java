import java.util.Scanner;
import java.util.Arrays;

public class ArraySmallestandLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];

        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int smallest = a[0];
        int largest = a[a.length-1];
        System.out.println("Smallest : "+smallest+"\n"+"Largest : "+largest);
    }
}
