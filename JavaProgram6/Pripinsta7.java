import java.util.Scanner;

public class Pripinsta7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=2;i<n;i++){
            if(n % i != 0){
                System.out.println("This number is Prime.");
                break;
            }else{
                System.out.println("This number is not prime.");
                break;
            }
        }
}
}
