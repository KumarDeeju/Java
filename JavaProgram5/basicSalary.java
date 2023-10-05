import java.util.Scanner;

public class basicSalary {
    public static void main(String[] args) {
        double HRA, DA;
        Scanner sc = new Scanner(System.in);
        int Bs = sc.nextInt();

        if(Bs <= 10000){
            HRA = 0.20*Bs;
            DA = 0.80*Bs;
        }else if(Bs <= 10001 && Bs >= 20000){
            HRA = 0.25*Bs;
            DA  = 0.90*Bs;
        }else {
            HRA = 0.30*Bs;
            DA = 0.95*Bs;
        }
        double grossSalary = Bs + HRA + DA;
        System.out.println(grossSalary);
    }
}
