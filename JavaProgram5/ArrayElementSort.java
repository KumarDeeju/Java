import java.util.Scanner;

public class ArrayElementSort {
    public static void main(String[] args) {
        int[] a = {55, 66, 78, 95, 45};
        int temp=0;
        System.out.println("Sorted Arrays Are : ");
        for(int i=0;i<a.length;i++){
           for(int j=i+1;j<a.length;j++){
             if(a[i] > a[j]){
                     temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
            }
             
           }
           System.out.print(a[i]+" ");
          
        }
        System.out.println();
        System.out.println("SUM of first and last Array : ");
        int l = a[0];
           int r = a[a.length-1];
           int sum  = l + r;
           System.out.println(sum);
        
    }
}
