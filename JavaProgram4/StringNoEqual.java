import java.util.*;

public class StringNoEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        Set<Character> ch = new LinkedHashSet<>();
        for(int i=0;i<st.length();i++){
            ch.add(st.charAt(i));
        }
        for(Character ans : ch){
            System.out.print(ans);
        }
    }
}
/*ShriSakti
Shriakt */