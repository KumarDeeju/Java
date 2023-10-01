import java.util.Scanner;
import java.util.Stack;

public class Stack4 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack();
        Scanner sc = new Scanner(System.in);
        //st = sc.nextInt();
        st.add(4);
        st.add(5);
        st.add(6);
        st.add(42);
        st.add(32);

        System.out.println(st);
    
        Stack<Integer> rt = new Stack<>();
        while(st.size() > 0){
            rt.push(st.pop());

        }
        System.out.println(rt);

        while(rt.size() > 0){
            int x = rt.pop();
           // System.out.print(x+" ");
            st.push(x);
        }
        System.out.println(st);
    }
}
