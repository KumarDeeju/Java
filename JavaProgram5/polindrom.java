import java.util.Scanner;

public class polindrom {
    static String Reverce(String s, int idx){
        // base case
        if(s.length() == idx) return"";
        // recursive work
        String SmallAns = Reverce(s, idx+1);
        return SmallAns + s.charAt(idx);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = Reverce(s, 0);
        if(s.equals(rev)){
            System.out.printf("%s Palindrom", s);
        }else{
            System.out.printf("%s no Palindrom", rev);
        }
    }
}
