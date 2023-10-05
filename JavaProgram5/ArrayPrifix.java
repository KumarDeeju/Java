import java.util.Scanner;

public class ArrayPrifix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        int[] pre = new int[size];

            // pre[] = p[i] + pre[]
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        pre[0] = a[0];
        for(int i=1;i<a.length;i++){
            pre[i] = pre[i-1] + a[i];
            
        }
        for(int i=0;i<a.length;i++){
             System.out.print(pre[i]+" "); 
        }
       

    }
}
