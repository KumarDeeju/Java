import java.util.Scanner;

public class PripinstaHCFgcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int HCF = 0;
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for(int i=1;i<=n1 || i<=n2;i++){
            if(n1 % i == 0 && n2 % i == 0){
                HCF = i;
            }
        }
        System.out.println(HCF);
    }
}
