import java.util.Scanner;

public class ArrayMatrixRowToColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column : ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        System.out.println("Enter the matrix : ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int[][] transport = new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                transport[i][j] = matrix[j][i];
            }
        }
        System.out.println("This Matrix in Changed row to column : ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
               System.out.print(transport[i][j]+" ");
            }
            System.out.println();
        }
    }
}
