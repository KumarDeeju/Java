import java.util.Scanner;

public class PrimeSizeHigest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // int k,l;
        // int temp = 0;
        // // sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     int m = sc.nextInt();
        //     for(k=1;k<m;k++){
        //         for(l=2;l<=k;l++){
        //             if(k%l==0){
        //                 break;
        //             }
        //         }
        //         if(k==l)
        //         temp = l;
        //     }
        //     System.out.print(temp);
        // }

            sc.nextInt();
        for(int i=0;i<n;i++){
            int m = sc.nextInt();
                int[] arr = new int[m];
                arr[i] = sc.nextInt();
            }
            int len = arr.length;
            int temp=0;
            int j,k;
            for(j=1;j<m;j++){
                for(k=2;k<=j;k++){
                    if((j+1) % k == 0){
                        break;
                    }
                }
                if(j == k)
                temp = k;
            }
            System.out.println(temp);



    }
}
