import java.util.Scanner;
public class Array14 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Etner The Value :");
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Array :");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            sum = a[i]+sum;
        }
            
        System.out.println("\n Array of sum:"+sum);
    }
}
