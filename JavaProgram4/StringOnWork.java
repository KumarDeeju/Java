import java.util.Scanner;

public class StringOnWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        char[] ch = new char[size];

        for(int i=0;i<size;i++){
            ch[i] = sc.next().charAt(0);
        }
        for(int i=0;i<ch.length;i++){
            if(ch[i] == 'A'|| ch[i] == 'E'||ch[i] == 'I'||ch[i] == 'O'||ch[i] == 'U'){
                System.out.print(ch[i]);
            }
        }
        
    }
}
