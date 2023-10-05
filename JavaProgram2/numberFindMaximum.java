import java.util.Scanner;
public class numberFindMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int ans = 0;

        for(int i=0;i<size;i++){ // pass karega - size tak
            System.out.print("Enter the number :");
            int element = sc.nextInt(); // element input ke liye
             
            if(ans < element){ // yaha pe ans se kya bada hai element jo input liye
                ans = element; // yaha pe ans me element ka value update hote rahega size tak.
            }
        }
        System.out.print(ans); // yaha se bigest value print karenge
    }
}
