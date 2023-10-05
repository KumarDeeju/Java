import java.util.Scanner;

public class reverce1 {
    static String ReverceStr(String s, int idx){
        // base case
        if(s.length() == idx) return"";
        // recursive work/small work
        String findresult = ReverceStr(s, idx+1);
            return findresult + s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(ReverceStr(s, 0));
    }
}
