import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        String[] st = new String[size];

        System.out.println("Enter the String : ");
        for(int i=0;i<size;i++){
            st[i] = sc.next();
            
        }
        for(int i=0;i<st.length;i++){
            System.out.print(st[i]);
        }
    }
}
