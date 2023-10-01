import java.util.Scanner;

public class StringCOunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ind = sc.nextInt();
        int t = ind-1;
        for(int i=0;i<str.length();i++){
            if(i == t){
                System.out.println(str.charAt(i));
            }
        }
    }
}
