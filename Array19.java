import java.util.Scanner;
import java.util.Arrays;
public class Array19{
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of :");
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
            Arrays.sort(a);
            for(int i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }

    }
}