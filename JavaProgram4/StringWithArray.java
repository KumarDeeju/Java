import java.util.Scanner;

public class StringWithArray {
    static String findDigit(String st){
        StringBuilder sb = new StringBuilder();
        boolean chCheck = false;
        // Loop of the String Line
        for(char c : st.toCharArray()){
            if(Character.isDigit(c)){
                sb.append(c);
                chCheck = true;
                
            }else if(chCheck){
                sb.append(" ");
                chCheck = false;
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++){
           String st = sc.nextLine();
           String result = findDigit(st);
           System.out.print(result);
        }
        
    }
}
