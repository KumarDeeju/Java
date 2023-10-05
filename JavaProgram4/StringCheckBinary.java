import java.util.Scanner;

public class StringCheckBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        boolean check = true;
        for(int i=0;i<st.length();i++){
            int n = st.charAt(i)-'0';
            if(n==2||n==3||n==4||n==5||n==6||n==7||n==8||n==9){
                check = false;
            }
        }
        if(check){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
