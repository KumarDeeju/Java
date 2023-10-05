import java.util.Scanner;

public class charNoSpacial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
            System.out.println(c+" is an Alphabet ");
        }else if(c >= '0' && c <= '9'){
            System.out.println(c+" is Number ");
        }else{
            System.out.println(c+" is special Character");
        }
    }
}
