import java.util.Scanner;

public class moveTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {33, 45, 23, 67, 45};
        int target = 45;

        for(int i=0;i<a.length;i++){
           if(a[i] != target){
            System.out.print(a[i]+" ");
           }
        }
    }
}
