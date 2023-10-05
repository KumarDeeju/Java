import java.util.Scanner;

public class StringSplit {
        public static void main(String[] args) {
            String text = "JAVAJ2EE";
            
            for (int i = 1; i <= text.length(); i++) {
                System.out.println(text.substring(0, i));
            }
        }

    }