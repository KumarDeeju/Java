import java.util.Scanner;
class Weekdays {
public static void main(String args[]){
Scanner ob = new Scanner(System.in);
System.out.println("put the week of no");
int Weekdays = ob.nextInt();
Switch(Weekdays);
{
case1:
System.out.println("Monday");
break;
case2:
System.out.println("Tuesday");
break;
case3:
System.out.println("Wednesday");
break;
case4:
System.out.println("Thursday");
break;
case5:
System.out.println("Friday");
break;
case6:
System.out.println("Saturday");
break;
case7:
System.out.println("Sunday");
break;
default:
System.out.println("Error");
}
}
}
