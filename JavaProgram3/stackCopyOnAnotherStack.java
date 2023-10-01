import java.util.Scanner;
import java.util.Stack;
public class stackCopyOnAnotherStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no Of element:");
        int n = sc.nextInt();
        System.out.println("Enter the element:");
        for(int i=1;i<=n;i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
    }
}
