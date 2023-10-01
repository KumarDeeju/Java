import java.util.Scanner;
public class PripinstaLCM2 {
public static void main(String args[]){
    int HCF = 0,LCM;
    Scanner sc = new Scanner(System.in);

int n1 = sc.nextInt();
int n2 = sc.nextInt();
//int max = n1 > n2 ? n1 : n2;

for(int i=1;i<=n1 || i<=n2;i++){
    if(n1 % i == 0 && n2 % i == 0){
        HCF = i;
    }
}
    LCM = (n1 * n2) / HCF; // LCM of math formula
    System.out.println(LCM);
}
}