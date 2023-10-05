import java.util.Scanner;

public class MonthChek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int monthNo = sc.nextInt();
        if(monthNo == 1 || monthNo == 3 || monthNo == 5 || monthNo == 7 || monthNo == 8
      ||  monthNo == 10 || monthNo == 12 ){
        System.out.println("This month are for 31 days");
      }else if( monthNo == 2 || monthNo == 4 || monthNo == 6 || monthNo == 9){
        System.out.println("This month are for 30 days");
      }else {
        System.out.println("This month is for 28 days");
      }
    }
}
