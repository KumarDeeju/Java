import java.util.Scanner;

public class meximumNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size :");
        int size = sc.nextInt();
        int ans = 0;

        for(int i=0;i<size;i++){
            System.out.print("Enter the element :");
            int element = sc.nextInt();

            if(element > ans ){
                ans = element;
            }
        }
        System.out.println("maximum no is :"+ans);
    }
}
