import java.util.Scanner;
public class trangle {
    public static void main(String[] args) {
        int Traingle = 180;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > 0 && b > 0 && c > 0){
             if((a + b + c) == Traingle){
                System.out.println("The traingle is valid");
            }else{
                System.out.println("The traingle not valid");
            }
           
        }
        else{
            System.out.println("The traingle not valid");
        }
    }
}
