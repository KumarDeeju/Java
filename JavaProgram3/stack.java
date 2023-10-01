import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(4);
        st.push(8);
        st.push(90);
        st.push(32);
        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("SIze is:"+st.size());
        // first element ko print karenge 
        // while(st.size() > 1){
        //     st.pop();
        // }
        // System.out.println(st.peek());
        // System.out.println(st);
         while(st.size() > 2){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
    }
}
