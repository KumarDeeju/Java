import java.util.Scanner;

public class Pripinsta6a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Year = sc.nextInt();

        String Ans = ((Year % 4 == 0)) && ((Year % 100 != 0 )) || (Year % 400 == 0) ? Year +" is Leap Year" :
        Year+" is not Leap Year";

        System.out.println(Ans);
    }
}
