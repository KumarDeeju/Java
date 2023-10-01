import java.util.Scanner;

public class InttoChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value :");
        int n = sc.nextInt();
        if(n%3==0 || n%5==0){
            if(n%3==0 && n%5==0){
                System.out.print("Both");
            }else if(n%3==0){
                System.out.print("Hai");
            }else if(n%5==0){
                System.out.print("Hello");
            } 
        }else{
            System.out.print("None");
        }
    }
}