import java.util.Scanner;

public class Pripinsta6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Year = sc.nextInt();

        if(Year % 400 == 0  || Year % 4==0 && Year % 100 != 0){
            System.out.println("Leap year");
        }else{
            System.out.println(Year+"-No LeapYear");
        }
    }
}
