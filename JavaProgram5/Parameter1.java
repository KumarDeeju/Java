public class Parameter1 {
String StudentName;
int StudentAge;

public Parameter1(String Name, int Age){
StudentAge = Age;
StudentName = Name;
}
    public static void main(String[] args) {
        Parameter1 Obj = new Parameter1("Rahul",22);
            System.out.print(Obj.StudentName+" "+Obj.StudentAge);
    }
}
