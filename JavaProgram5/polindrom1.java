import java.util.Scanner;

public class polindrom1 {
    static boolean isPolindrom(String Element, int l, int r){
        // base case
        if( l >= r ) return true;
        // recursion work with self work
        return(Element.charAt(r) == Element.charAt(l) && isPolindrom(Element, l+1, r-1));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Element = sc.nextLine();
        System.out.println(isPolindrom(Element, 0, Element.length()-1 ));
    }
}
