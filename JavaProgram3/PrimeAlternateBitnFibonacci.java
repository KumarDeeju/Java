import java.util.*;

public class PrimeAlternateBitnFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j] = sc.nextInt();
            }
        } 
        int zero = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j] == 0){
                    zero++;
                }
            }
        }
                    int totalElements = arr.length * arr[0].length;

                    if(zero > totalElements / 2){
                        System.out.print("Matrix is spars");    
                    }else{
                        System.out.print("Matrix is not spars");
                    }
    }
}
