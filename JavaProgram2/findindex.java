import java.util.Scanner;
public class findindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        char c = sc.next().charAt(0);
        int ans = 0;
        boolean check = false;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i) == c){
            ans=i;
            check = true;
            break;
            
            }
        }
        if(check){
            System.out.println(ans);
        }else{
            System.out.println(-1);
        }
    }
}
