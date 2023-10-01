import java.util.HashMap;
import java.util.Scanner;

public class StringCharArrayCopair {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String st = sc.next();
    int[] arr = new int[st.length()];
    for(int i=0;i<st.length();i++){
        arr[i] = sc.nextInt();
    }
    HashMap<Integer, Character> mp = new HashMap<>();
    for(int i=0;i<st.length();i++){
        Character ch = st.charAt(i);
        if(!mp.containsKey(ch)){
            mp.put(ch, 1);
        }else{
            mp.put(ch, mp.put(ch, arr[i]));
        }
    }
   }
}
