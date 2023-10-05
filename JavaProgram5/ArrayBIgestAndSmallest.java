import java.util.Scanner;
// find the largest and hiegest Element of Number
public class ArrayBIgestAndSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size Value : ");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.println("Enter the Array Element : ");
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        int big = 0;
        System.out.println("Finded bigest Value : ");
        for(int i=0;i<a.length;i++){
          
                if(a[i] > big){
                    big = a[i];
                }
            }
            System.out.println(big);

       
        }
    }

