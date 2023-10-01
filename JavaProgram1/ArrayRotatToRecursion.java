// import java.util.Scanner;

// public class ArrayRotatToRecursion {

//     static void rotateFunction(int[] arr, int k){
//         int len = arr.length;
//         k = k % len;

//         RotateFunction(arr,0, len-1);
//         RotateFunction(arr,0, k-1);
//         RotateFunction(arr,k-1, len-1);
//     }

//     static void RotateFunction(int[] arr,int s, int e){
//         while(s < e){
//             int t = arr[s];
//             arr[s] = arr[e];
//             arr[e] = t;
//             s++;
//             e--;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int[] arr = new int[size];
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }
//         int k = sc.nextInt();
//         rotateFunction(arr, k);
//         for(int ans : arr){
//             System.out.print(ans+" ");
//         }
//     }
// }

import java.util.*;
public class ArrayRotatToRecursion{
    static void rotat(int num[],int k){
        int len = num.length;
        k =k%len;
        rv(num,0,len-1);
        rv(num,0,k-1);
        rv(num,k,len-1);
    }
    static void rv(int[] num, int s, int e){
        while(s<e){
            int t = num[s];
            num[s] = num[e];
            num[e] = t;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int size = sc.nextInt();
        int[] num = new int[size];
        System.out.println("enter ");
        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotat(num,k);
        for(int rs : num){
            System.out.print(rs+" "); 
        }
    }
}