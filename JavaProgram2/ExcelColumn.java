import java.util.Scanner;

public class ExcelColumn {

    static String Columchar(int col){
        StringBuilder sb = new StringBuilder();

        while( col > 0 ){
            int rem = (col-1) % 26;
            sb.append((char) (rem + 'A'));
            col = (col-1)/26;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();

        String st = Columchar(col);
        System.out.print(st);
    }
}
/*

intput- 56
output- BD
*/ ExcelColumn }