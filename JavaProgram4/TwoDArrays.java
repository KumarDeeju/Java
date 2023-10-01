import java.util.*;
public class TwoDArrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of ROW :");
        int row = sc.nextInt();
        System.out.print("Enter the value of Col :");
        int col = sc.nextInt();
        int numbers [] []= new int[row][col];
        System.out.print("Enter the numbers of row and col \n:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                
                numbers [i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the value of X:");
        int x = sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(numbers[i][j]==x){
                    System.out.print("X of no is found location :("+i+","+j+")");
                }

            }
        }
    }
}