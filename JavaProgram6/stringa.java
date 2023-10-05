import java.util.Scanner;

public class stringa {
    static String RemoveA(String s, int idx){
        // base case
        if(idx == s.length()) return"";
        // recursive work
        String smallAns = RemoveA(s, idx+1);
        char currElemnt = s.charAt(idx);
        if(currElemnt != 'a') {
            return smallAns + currElemnt;
        } else{
            return smallAns;
        }
        //self work
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(RemoveA(s, 0));
    }
}
