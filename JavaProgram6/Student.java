class TestStudent2 {
    int id;
    String name;
}
public class Student {
    public static void main(String args[]){
        TestStudent2 s1 = new TestStudent2();
        s1.id=101;
        s1.name="Sonoo";
        System.out.println(s1.id+" "+s1.name);
    }
}
