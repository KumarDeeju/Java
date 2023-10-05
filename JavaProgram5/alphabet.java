import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //char ch = sc.next().charAt(0);
        //char find = sc.next().charAt(0);
        String find = sc.nextLine();
        char c = find.charAt(0);
        for(char i = 'A';i<='Z';i++){
            if(i <= c){
                System.out.print(c+" is an alphabet ");
                break;
            } else {
                System.out.print(c+" is not alphabet");
                break;
            }
        }
    }
}
