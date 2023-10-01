import java.util.Scanner;
public class puilfjla {

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Array :");
    int size = sc.nextInt();
    int[] a = new int[size];
    int[] b = new int[size];
    System.out.print("Enter the first arrya :");
    for(int i=0;i<size;i++){
        
        a[i] = sc.nextInt();
    }
        System.out.print("Enter the second array :");
    for(int i=0;i<size;i++){
    
        b[i] = sc.nextInt();
    }
    for(int i=0;i<a.length;i++){

        for(int j=0;j<b.length;j++){
            if(a[i] == b[j]){
                // i++;
                // j++;
                System.out.println("Yes");
                //break;

            }else{
                System.out.println("No");
              //  break;
            }
        }
        break;
    }
}
}

