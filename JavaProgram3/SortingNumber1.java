import java.util.Scanner;
public class SortingNumber1 {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the value of Count:");
int input=sc.nextInt(),temp;
System.out.print("Enter array values : \n");
int arr[]=new int[input];
for(int i=0;i<input;i++){
arr[i]=sc.nextInt();
}
for(int m=0;m<arr.length;m++){
for(int n=m+1;n<arr.length;n++){
if(arr[m]>arr[n]){
temp = arr[m];
arr[m]=arr[n];
arr[n]=temp;
}
}
}
System.out.print("Stored order are:\n");
for(int t:arr) {
System.out.println(t);
}
}
}