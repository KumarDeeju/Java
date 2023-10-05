
import java.util.*;

public class TimeConversion12hTo24h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String h = sc.next();
        String m = sc.next();
        String s = sc.next();
        String mid = sc.next();

        String of = ":";

        String format = h+of+m+of+s+mid;

         String str = "";
        if(format.substring(0, 2).equals("12") && format.contains("am")){
            str = "00";
            format = str+format.substring(2, format.length()-2);
        }
        if(!format.substring(0, 2).equals("12") && format.contains("pm")){
            str = Integer.toString(Integer.parseInt(format.substring(0, 2)) + 12);
            format = str+format.substring(2, format.length()-2);
        }
        System.out.print(format);
    }
}

