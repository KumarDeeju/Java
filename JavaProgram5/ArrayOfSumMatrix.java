import java.util.Scanner;

public class ArrayOfSumMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        int[][] a = new int[size][size];
        int[][] b = new int[size][size];
        int[][] sum = new int[size][size];
        int[][] sub = new int[size][size];
        System.out.println("Enter the matrix 1 : ");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                a[i][j]=sc.nextInt();
            }
        }
         System.out.println("Enter the matrix 2 : ");

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Sum Matrix:");

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
               sum[i][j] = a[i][j] + b[i][j];
                 System.out.print(sum[i][j]+" ");
            }
            System.out.println();
           
        }
        System.out.println("Sub Matrix:");

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                 sub[i][j] = a[i][j] - b[i][j];
                 System.out.print(sub[i][j]+" ");
            }
            System.out.println();
        }
       
    }
}
