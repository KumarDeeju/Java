import java.util.Scanner;

public class ArrayRotatElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        } // 3 4 5 6 7 8
        int[] x = new int[n];
        int m = sc.nextInt();
        for(int i=a.length-1;i>=m;i--){
           x[i] = a[i];
        //    System.out.print(x[i]+" ");
        }
        for(int j=m;j<x.length;j++){
            for(int i=m-1;i>=0;i--){
                x[i] = a[j];
                System.out.print(x[j]+" ");
        }
    }
    }
}
