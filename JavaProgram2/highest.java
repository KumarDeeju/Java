import java.util.Scanner;
public class highest {
public static void main(String args[]){
    int l,m,p,q;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n < 100){
        l = n%10;
        m = 10-l;
        System.out.println(m);
    }
    
    if(n < 1000 && n > 100){
        p = n%100;
        q = 110-p;
        System.out.println(q);
    }
    
}
}