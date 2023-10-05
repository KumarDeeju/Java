import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        int [][] a = new int[3][3];
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of matrix :");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("geven the matrix");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
