import java.util.Scanner ;
public class WeatherTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 10){
            System.out.println("Very cold weather");
        }else if(n >= 11 && n <= 20){
            System.out.println("cold weather");
        }else if(n >= 23 && n <= 30){
            System.out.println("Normal in Temp");
        }else if(n >= 40 && n <= 42){
            System.out.println("Its very hot");
        }else{
            System.out.println("Its very hot");
        }
    }
}
