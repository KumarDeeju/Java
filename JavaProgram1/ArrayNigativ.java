import java.util.*;
public class ArrayNigativ {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int N = scanner.nextInt();

        // Read the array elements
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Rearrange the array
        for (int i = 0; i < N; i++) {
            if (arr[i] != -1 && arr[i] != i + 1) {
                int x = arr[i];
                while (x != -1 && x != i + 1) {
                    int temp = arr[x - 1];
                    arr[x - 1] = x;
                    x = temp;
                }
                arr[i] = x;
            }
        }

        // Print the rearranged array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
