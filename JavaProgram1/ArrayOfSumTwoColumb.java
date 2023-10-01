import java.util.Scanner;

public class ArrayOfSumTwoColumb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int sum = 0;
        int[][] A = new int[r][c];

        
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                A[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                sum = A[0][0] + A[1][0];
            }
        }
        System.out.println(sum);
    }
}
