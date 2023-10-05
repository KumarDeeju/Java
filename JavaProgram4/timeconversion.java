import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class timeconversion {

// public class TimeConversion {
    public static String convertTo24HourFormat(String time12Hour) {
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:sa");
            SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
            Date date = inputFormat.parse(time12Hour);
            return outputFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String h = sc.next();
        String m = sc.next();
        String s = sc.next();
        String mid = sc.next();

        String of = ":";

        String format = h+of+m+of+s+mid;
        String time12Hour = format;
        String time24Hour = convertTo24HourFormat(time12Hour);
        if (time24Hour != null) {
            System.out.println(time24Hour);
        } else {
            System.out.println("Invalid input format.");
        }
    }
}


