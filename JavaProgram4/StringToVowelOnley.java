import java.util.Scanner;

public class StringToVowelOnley {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        char[] c = new char[size];

        for(int i=0;i<c.length;i++){
            c[i] = sc.next().charAt(0);
            
        }

        for(int i=0;i<c.length;i++){
            char ch = c[i];
            if(ch == 'A'||ch=='I'||ch=='E'||ch=='O'||ch=='U'){
                System.out.print(ch);
            }
        }
        

    }
}
