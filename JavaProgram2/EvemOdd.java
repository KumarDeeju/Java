import java.util.*;
public class EvemOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a :");
        int a = sc.nextInt();
        if(a % 2 == 0)
        {
            System.out.print("a is Even:"+a);
        }else {
            System.out.println("a is odd :"+a);
        }

    }
}