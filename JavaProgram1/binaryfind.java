import java.util.Scanner;

public class binaryfind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
            sc.nextLine();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            for(int j=1;j<=a;j++){
                String ans = Integer.toBinaryString(j);
                System.out.print(ans+" ");
            }
        }
    }
}

