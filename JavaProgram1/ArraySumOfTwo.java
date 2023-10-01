import java.util.Scanner;

public class ArraySumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if()
        System.out.println("Enter the row : ");
        int r = sc.nextInt();
        System.out.println("Enter the colmn : ");
        int c = sc.nextInt();
        int[][] A = new int[r][c];
        int[][] B = new int[r][c];
        int[][] C = new int[r][c];
        int[][] D = new int[r][c];

        
        System.out.println("Enter The first Matrix : ");
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter The Second Matrix : ");
        for(int i=0;i<B.length;i++){
            for(int j=0;j<B.length;j++){
                B[i][j] = sc.nextInt();
            }
        }
        System.out.println("Sum of The two Matrix : ");
    
        for(int i=0;i<B.length;i++){
            for(int j=0;j<B.length;j++){
                
                C[i][j] = A[i][j] + B[i][j];
            }
           
        }
        for(int i=0;i<B.length;i++){
            for(int j=0;j<B.length;j++){
                
                System.out.println(C[i][j]);
            }
         
        }
        for(int i=0;i<B.length;i++){
            for(int j=0;j<B.length;j++){
                
                D[i][j] = A[i][j] - B[i][j];
            }
           
        }
        for(int i=0;i<B.length;i++){
            for(int j=0;j<B.length;j++){
                
                System.out.println(D[i][j]);
            }
           
        }

    }
}
