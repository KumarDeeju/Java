import java.util.Scanner;
public class D2ndArray {
    public static void main(String[] args) {
        int a[][] = new int [3][3];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value :");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
