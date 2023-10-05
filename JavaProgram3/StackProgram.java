import java.util.Scanner;
import java.util.Stack;

public class StackProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        System.out.println("Enter the Element : ");
        for(int i=0;i<size;i++){
            int x = sc.nextInt();

            st.push(x);
        }
        System.out.println("this is stack Values : "+st);

        Stack<Integer> gt = new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());

        }
        System.out.println("This is the Second Stack referal : ");
        System.out.println(gt);

        Stack<Integer> ct = new Stack<>();
        while(gt.size()>0){
            ct.push(gt.pop());
        }
        System.out.println("This is the same format in copy:\n"+ct);
    }
}
