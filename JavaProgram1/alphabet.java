import java.util.Scanner;

public class alphabet {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        for(int i='A';i<='Z';i++){
            if(i <= c){
                System.out.println(c+" is an alphabet ");
                break;
            }else{
                System.out.println(c+" is not an alphabet ");
                break;
            }
        }
    }
}
