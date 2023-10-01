import java.util.Scanner;
import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        int[] b = new int[size];
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        // System.out.println(a[0]);
        // System.out.println(a.length);
        // int len = a.length;
        // int mid = a.length/2;
        // int l = a[0];
       
        //for(int i=0;i<len;i++){

            // // for(int j=r-1;j>=mid+1;j--){
            //     if(a[i] != a[len-1]){
            //         int temp = a[i];
            //         a[i] = a[len-1];
            //         a[len-1] = temp;
            //         System.out.println();
                
           // }  
           for(int i=0;i<a.length;i++){
                 temp = a[a.length-1];
                a[a.length-1] = a[0];
                    a[0] = temp;
                
                System.out.print(a[i]+" "); 
           
           }
          
        }
        
    }
