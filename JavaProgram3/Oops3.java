class StudentData{
    String Name;
    int RollNo;
}


public class Oops3 {
    public static void main(String[] args) {
        StudentData Obj1 = new StudentData();
        Obj1.Name = "Rahul";
        Obj1.RollNo = 86;
        System.out.println(Obj1.Name);
        System.out.println(Obj1.RollNo);

        StudentData Obj2 = new StudentData();
        Obj2.Name = "Arjun";
        Obj2.RollNo = 83;
        System.out.println(Obj2.Name);
        System.out.println(Obj2.RollNo);
    }
}
