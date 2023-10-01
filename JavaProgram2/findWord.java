import java.util.HashSet;
import java.util.Scanner;

public class findWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String st1 = sc.next();
        HashSet<Character> hs = new HashSet<>();
        for(char ch : st1.toCharArray()){
            hs.add(ch);
        }
        for(char ch1 : st.toCharArray()){
            if(!hs.contains(ch1)){
                System.out.print(ch1);
            }
        }
    }
}
