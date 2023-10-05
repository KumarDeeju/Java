import java.util.Scanner;
import java.util.Stack;

public class Stack234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter the size:");
        int n = sc.nextInt(),x;
        for(int i=1;i<=n;i++){
            x = sc.nextInt();
            st.push(x);
        }
        System.out.println("ST: "+st);
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            int y = st.peek();
            rt.push(y);
            st.pop();
        }
        System.out.println("RT: "+rt);
        Stack<Integer> gt = new Stack<>();
        while(rt.size()>0){
            int z = rt.peek();
            gt.push(z);
            gt.pop();
        }
        System.out.println("GT: "+gt);
    }
}
