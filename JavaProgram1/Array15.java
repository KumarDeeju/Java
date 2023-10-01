import java.util.Scanner;
public class Array15 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int sum = 0;
        double avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value :");
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Array :");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            sum = a[i]+sum;
        }
        avg=sum/a.length;
        System.out.print("Sum Is:"+sum+"Average Is : "+avg);
    }
}
