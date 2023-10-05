import java.util.Scanner;
import java.util.Stack;

public class StackCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter the Seze :");
        int size = sc.nextInt();

        for(int i=0;i<size;i++){
            int x = sc.nextInt();

            st.push(x);
        }
        System.out.print(st);

    }
}
