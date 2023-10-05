import java.util.Scanner;

public class StringInArraytoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] str = new String[size];

        for(int i=0;i<size;i++){
            str[i] = sc.next();
        }
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]);
        }
    }
}
