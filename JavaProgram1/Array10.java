import java.util.Scanner;

import javax.xml.transform.Source;

public class Array10 {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array :");
        for(int i=0;i<a.length;i++){
             a[i] = sc.nextInt();
        }
        System.out.println("value of array:");
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("Reverce Array:");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
}
