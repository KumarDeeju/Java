package CodingNinga;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic sallary :");
        double basic = sc.nextInt();
        char Ollow = sc.next().charAt(0);
        double hra = basic*0.20;
        double da = basic*0.50;
        double pf = basic*0.11;
        double TotalSalary;

        if(Ollow == 'A'){
            Ollow = 1700;
        }
        else if (Ollow == 'B') {
            Ollow = 1500;
        } else {
            Ollow = 1300;
        }
        TotalSalary =  Math.round(basic + Ollow + hra + da - pf);
        System.out.println((int)TotalSalary);
    }
}
