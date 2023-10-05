import java.util.Scanner;
public class Pripinsta15 {
    public static void main(String[] args) {
        int fact=1,sum=0;
        
        Scanner sc = new Scanner(System.in);
        int srt = sc.nextInt();
        int temp = srt;
        
        //int l = srt.lenght();
        //int n = Integer.parseInt(srt);
        while(temp != 0){
            int rem = temp % 10;
            for(int i=1;i<=rem;i++){
                fact *=i;
            }
            sum +=fact; 
            temp = temp/10;
        }
        // if(srt == sum){
        //     System.out.print("So it is a Strong Number.");
        // }else{
        //     System.out.print("is not Strong number.");
        // }
        System.out.print(sum);

    }
}
