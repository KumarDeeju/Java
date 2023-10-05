import java.util.*;

public class StringInFindSingleWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        Set<Character> set = new LinkedHashSet();
        for(int i=0;i<st.length();i++){
            set.add(st.charAt(i));
        }
        for(Character c : set){
            System.out.print(c);
        }
    }
}
// RESULT
// INPUT --> Malyalam
// OUTPUT --> Malym