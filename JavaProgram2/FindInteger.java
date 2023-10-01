import java.util.Scanner;

public class FindInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int n = sc.nextInt();
        int count=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)-'0' == n){
                count++;
                sb.append(i+" ");
            }
        }
        System.out.println(count);
        System.out.print(sb);
    }
}
