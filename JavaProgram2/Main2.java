import java.util.*;
public class Main2 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr = new int[n][n];
    int k=1;
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            arr[i][j] = k;
            System.out.print(arr[i][j]);
            k++;
        }
        System.out.println();
    }
    for(int i=n-1;i>=0;i--){
        for(int j=0;j<=i;j++){
            System.out.print(arr[i][j]);
        }
        System.out.println();
    }
    
}
}