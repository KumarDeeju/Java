import java.util.Scanner;
public class charNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        char[] arr = st.toCharArray();
        int len = st.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(arr[i] >= 48 && arr[i] <= 57){
                arr[i] = arr[i]-'0' + 1; 
                // arr[i] =  (char)sum;
            }
        }
        for(int i=0;i<st.length();i++){
            System.out.print(arr[i]);
        }
    }
}
