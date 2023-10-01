import java.util.Scanner;

import java.util.Arrays;
public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] inputArr = {1, 2, 3, 4, 5, 6, 7};
        int size = sc.nextInt();
        int[] inputArr = new int[size];
        for(int i=0;i<size;i++){
            inputArr[i] = sc.nextInt();
        }
        int[] resultArr = rearrangeMaxMin(inputArr);
        // System.out.println(Arrays.toString(resultArr));
        for(int i=0;i<resultArr.length;i++){
            System.out.print(resultArr[i]+" ");
        }
    }
    public static int[] rearrangeMaxMin(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);  // Sort the array in ascending order

        int[] result = new int[n];
        int i = 0, j = n - 1;
        int index = 0;

        while (i < j) {
            result[index++] = arr[j];  // Append the maximum element from the end
            result[index++] = arr[i];  // Append the minimum element from the beginning
            i++;
            j--;
        }
        if (i == j) {  // If the array has odd length, there's a middle element left
            result[index] = arr[i];
        }

        return result;
    }
}

