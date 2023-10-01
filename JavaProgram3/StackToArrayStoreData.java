import java.util.Scanner;
import java.util.Stack;

public class StackToArrayStoreData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        st.push(5);
        st.push(6);
        st.push(53);
        st.push(57);
        st.push(35);
        st.push(45);
        st.push(58);
        st.push(15);

        System.out.println(st);
        
        int n = st.size();
        int[] arr = new int[n];
        for(int i=n-1;i>=0;i--){
            arr[i] = st.pop();


        }
        sou
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            //st.push(arr[i]);
        }
    }
}
