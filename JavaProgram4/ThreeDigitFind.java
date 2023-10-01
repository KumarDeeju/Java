import java.util.Scanner;
public class ThreeDigitFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;
        num = sc.nextLong();
        String str = String.valueOf(num);

        char Chars[] = str.toCharArray();
        int log = Chars.length;
        int size = log%3 == 0 ? log/3 : log/3+1;

        int a[] = new int[size];
        int index = 0;a

        for(int i=0;i<log-2;i+=3){
            int fd = Chars[i]-'0';
            int sd = Chars[i+1]-'0';
            int td = Chars[i+2]-'0';

            if(fd != sd && fd != td){
                int pair = (fd*100)+(sd+10)+td;
                a[index++] = pair;
            }
        }
        int Max = a[0];
        for(int i=0;i<index; i++){
            if(Max < a[i]){
                Max = a[i];
            }
        }
        System.out.println("Three digit found :");
        System.out.println(Max);

    }
    
}
