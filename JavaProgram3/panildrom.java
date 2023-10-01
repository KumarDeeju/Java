import java.util.Scanner;

public class panildrom {
    static boolean isPanildrom(String n, int l, int r){
        if(l>=r) return true;
        return (n.charAt(r) == n.charAt(l) && isPanildrom(n, l+1, r-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.println(isPanildrom(n, 0, n.length()-1));
    }
}
