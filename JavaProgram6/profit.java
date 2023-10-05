import java.util.Scanner;

public class profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sell = sc.nextInt();
        int cost = sc.nextInt();
        int profit;
        if( sell >= cost){
            profit = sell - cost;
            System.out.println("profit:"+profit);
        }else if(cost >= sell){
            int loss = cost - sell;
            System.out.println("Loss:"+loss);
        }
    }
}
