import java.util.Scanner;

import javax.swing.SpinnerDateModel;

public class TwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int rows = sc.nextInt();
        System.out.println("Enter the Nmber: ");
        int cols = sc.nextInt();

        int [][] number = new int [rows][cols];
        System.out.println("Enter the matrix from array :");
        for(int i=0;i<rows; i++){
            for(int j=0;j<cols;j++){
                number[i][j] = sc.nextInt();

            }
        }
        System.out.println("2d Array matrix is haer :");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
