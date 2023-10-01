import java.util.Scanner;

public class ArrayAlternage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n]; 
        for(int i=0;i<a.length;i++){
            a[i] = i+1;  // 1 2 3 4 5               
        }
        int len  = a.length;
        int[] b = new int[len*2];
        int i=0,k=0;
        while(i<len){
            b[k] = a[i];
            i++;
            k += 2;
        }
        int t=1;
        for(int j=a.length-1;j>=0;j--){
            b[t] = a[j];
            t += 2;
        }
        for(int ans : b){
            System.out.print(ans+" ");
        }
        // for(int f=0;f<b.length;f++){
        //     System.out.print(b[f]+" ");
        // }
        
    }
}
