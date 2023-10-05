import java.util.Scanner;
public class cnditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%3==0 || n%5==0){
            if(n%3==0 && n%5==0){
                System.out.println("Both");
            }else if(n%3==0){
                System.out.println("Hai");
            }else if(n%5==0){
                System.out.println("Hello");
            }
        }else{
            System.out.println("None");
        }
    }
}
