class Student{
    int id;
    String name;
}
public class TestStudent2 {
    public static void main(String[] args) {
        // creating objects
        Student s1 = new Student();
        Student s2  = new Student();
        //initializing objects
        s1.id=101;
        s1.name = "Pravin";
        s2.id=102;
        s2.name = "Rahul";
        // printing Data
        System.out.println("Loose"+s1.id+" "+s1.name);
        System.out.println("Mental"+s2.id+" "+s2.name);
    }
}
