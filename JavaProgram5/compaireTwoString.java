import java.util.Scanner;
public class compaireTwoString {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        int[] b = new int[size];

        for(int i=0;i<size;i++){
             a[i] = sc.nextInt();
        }

      
         for(int i=0;i<size;i++){
             b[i] = sc.nextInt();
        }
            
            for(int i=0;i<=b.length-1;i++){
                if(a[i] != b[i]){

                    count++;

            }
            
        }
        if(count == size-1 || count == size-1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        
    }
   
}
