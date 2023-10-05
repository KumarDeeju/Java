import java.util.*;
class Pattern1 {
public static int calculatInto(int a, int b){
    int mult = a*b;
    return mult;
}    

public static void main(String args[]){
    Scanner ob = new Scanner(System.in);
    int a = ob.nextInt();
    int b = ob.nextInt();

    int mult = calculatInto(a,b);
    System.out.println("enter 2 value of multiple :"+mult);
    

}
    
}