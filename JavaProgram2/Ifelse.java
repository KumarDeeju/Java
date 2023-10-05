import java.util.*;
public class Ifelse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the vlue of heart :");
        int heart = sc.nextInt();
        if(heart > 9){
            System.out.print("I Love You");
        } else {
            System.out.println("I hate you");
        }
    }
}