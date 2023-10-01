import java.util.Scanner;

public class ArrayInChangeRowColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column : ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] Array_2D = new int[r][c];

        System.out.println("Enter the Matrix :");
        for(int i=0;i<Array_2D.length;i++){
            for(int j=0;j<Array_2D.length;j++){
                Array_2D[i][j] = sc.nextInt();
            }
        }
        int[][] Matrix = new int[c][r];
        System.out.println("In this matrix changed row and column :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                Matrix[i][j] = Array_2D[j][i];
            }
        }
        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix.length;j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
