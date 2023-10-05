import java.util.Scanner;

public class ExeclChar {
    // static String ExcelColmn(int col){
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();
        // ExcelColmn(col);
        StringBuilder sb = new StringBuilder();

        while(col > 0){
            int rem = (col-1) % 26;
            sb.append((char) (rem +'A'));
            col = (col-1) / 26; 
        }
        String st = sb.reverse().toString();
        System.out.println(st);
    }

}
