import java.util.*;
public class EvenOdd {
    public static void main(String args[]){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any even no:");
        a = sc.nextInt();
        if(a % 2 == 0){
            System.out.println("Even no :"+a);
        } else {
            System.out.println("Odd no :"+a);
        }
    }
}
