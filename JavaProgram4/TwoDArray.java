import java.util.*;
public class TwoDArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int cols=sc.nextInt();
        int numbers[][]=new int [row][cols];
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.print(numbers[row][cols]+" ");
            }
            System.out.println();
        }
    }
}