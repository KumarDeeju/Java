import java.util.Scanner;

public class FindPercentage {
    static int findSbPer(int totalSub, int SubSum){
        return SubSum / totalSub;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub = 5,sum = 0,num;
        for(int i=1;i<=sub;i++){
            sum += num = sc.nextInt();
        }
        System.out.println(findSbPer(sub, sum));
    }
}
