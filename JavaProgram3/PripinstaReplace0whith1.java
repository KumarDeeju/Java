import java.util.Scanner;

public class PripinstaReplace0whith1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String st = Integer.toString(n);
        String s = "";
        for(int i=0;i<st.length();i++){
            if(st.charAt(i) == '0'){
                s = s + '1';
            }else{
                s = s + st.charAt(i);
            }
            
        }
        System.out.print(s);
    }
}
