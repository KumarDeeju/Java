import java.util.Scanner;
class table
{
public static void main(String args[]){
Scanner ob = new Scanner(System.in);
System.out.print("enter the any no:");
int a = ob.nextInt();
for(int i=1;i<=10;i++)
{
System.out.println("No of Table:"+(a)*(i));
}
}
}
