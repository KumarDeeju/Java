import java.util.Scanner;

public class swapAdjacentDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int len = st.length();
        // int mid = len/2;
        int temp = 0;
        // for(int i=0;i<mid;i++){
        //     temp = st.charAt(i)-'0'
        //     st.charAt(i)-'0' = st.charAt(mid-i)-'0';
        //     st.charAt(mid-i)-'0' = temp;

        // }
        // for(int i=len-1;i>=0;i--){
        //     temp = st.charAt(i)-'0'
        //     st.charAt(i)-'0' = st.charAt(mid-i)-'0';
        //     st.charAt(mid-i)-'0' = temp;

        // }

        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                temp=st.charAt(i);
                st.charAt(i) = st.charAt(j); 
                st.charAt(j) = temp;

                System.out.print(st.charAt(j));
            }
        }

    }
}
