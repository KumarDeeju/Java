import java.util.Scanner;

public class findNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int find = sc.nextInt();
        int k = -n;
        for(int i=k;i<=n;i++){
            //{
                if(find <= n){
                System.out.print(find+"fall between"+ n +" to"+ k);
                break;
            }else if(k <= find){
                System.out.print(find+" does not fall between"+ n +"to"+ k);
                break;
            }
        }
    }
}
