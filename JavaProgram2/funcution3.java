import java.util.*;
public class funcution3 {
    public static int Multiple(int a, int b){
        int mult = a * b;
        return mult ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mult = Multiple(a, b);
        System.out.println("Multiple :"+mult);
    }
}
