import java.util.Scanner;

public class ArrayWithStringDuplicate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int size = sc.nextInt();
        
        sc.nextLine();
        // for(int i=0;i<n;i++){
            for(int j=0;j<size;j++){
                String[] str = new String[size];

                str[j] = sc.nextLine();
            }
        // }
        for(int i=0;i<str.length;i++){

            System.out.print(str[i]+" ");
        }
    }
}