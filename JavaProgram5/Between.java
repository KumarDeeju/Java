import java.util.Scanner;

public class Between {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int neg = (-n);
        int target = sc.nextInt();
        if(n > neg){
            System.out.println(target+" falls between "+neg+" to "+n);
        }else{
            System.out.println(target+" does not fall between"+neg+" to "+n);
        }
    }
}
