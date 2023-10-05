import java.util.*;
public class function3 {
    public static float Devided(float a, float b){
        float Dev = a / b;
        return Dev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float Dev = Devided(a, b);
        System.out.println("Devid :"+Dev);
    }
}
