import java.util.Scanner;

public class PripinstaLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int LCM = 0;
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int max = n1 > n2 ? n1 : n2;
        
        for(int i=max;i<=n1*n2;i++){
            if(i % n1 == 0 && i % n2 == 0){
                LCM = i;
                break;
            }
        }
        System.out.println(LCM);
    }
}
