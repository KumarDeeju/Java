import java.util.Stack;
public class StackRec {
public static void ReverseStack(Stack<Integer> st){
    if(st.size() == 0) return;

    int x = st.pop();
    System.out.print(x+" ");
    ReverseStack(st);
    st.push(x);
}
public static void OrignalRevrce(Stack<Integer> st){
    if(st.size() == 0) return;

    int top = st.pop();
    ReverseStack(st);
    System.out.println(top);
    st.push(top);
}





    public static void main(String[] args) {
        Stack<Integer> st = new Stack();
        st.add(5);
        st.add(3);        
        st.add(64);        
        st.add(62);        
        st.add(61);        
        st.add(23);        
        st.add(43);        
        st.add(11);        
        st.add(43);        
        st.add(7);        
        st.add(88);        
        st.add(33);        
        st.add(42);        
        st.add(23);        
        st.add(62);
       // System.out.println(st); 
        
       // ReverseStack(st);
        OrignalRevrce(st);
    }
}
