//import java.util.*;
public class Greater {
    public static void main(String args[]){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the any three no:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a>b){
            System.out.print("a is greater");
        }else{
            System.out.print("c is greater");

            if(b>c){
                System.out.print("b is greater");
            }
            else {
                System.out.println("c is greater");
            }
        }
    }
}