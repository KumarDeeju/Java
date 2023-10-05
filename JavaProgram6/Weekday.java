import java.util.Scanner;
class Weekdays {
public static void main(String args[]){
Scanner ob = new Scanner(System.in);
System.out.println("put the week of no");
int Week = ob.nextInt();
Switch(Weekdays)
{
case 1:
System.out.println("Monday");
break;
case 2:
System.out.println("Tuesday");
break;
case 3:
System.out.println("Wednesday");
break;
case 4:
System.out.println("Thursday");
break;
case 5:
System.out.println("Friday");
break;
case 6:
System.out.println("Saturday");
break;
case 7:
System.out.println("Sunday");
break;
default:
System.out.println("Error");
}
}
}
