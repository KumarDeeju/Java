import java.util.Scanner;

public class negPosZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
    //    if(n < 0){
    //     System.out.println("negative");
    //    }else if(n > 0){
    //     System.out.println("positive");
    //    }else{
    //     System.out.println("Zero");
    //    }
        if(n < 0 || n > 0){
            System.out.println("negative");
        }else {
            System.out.println("positive");
        }
    }
}
