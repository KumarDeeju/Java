import java.util.Scanner;

public class StringSubStringInSearchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        String str = sc.nextLine();
        String targe = sc.next();

       int fnd = str.indexOf(targe);
       int k = fnd+1;
        System.out.println(k);
    }
}

// OUTPUT IS
// HeeloWorld (STRING)
// World (FIND WORD)
// 6 (ON INDEX)