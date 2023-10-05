class Student {
    int rollno;
    String name;
    void insertRecord(int r,String n){
        rollno = r;
        name = n;
    }
    void displayInformation(){
        System.out.println(rollno+" "+name);

    }
}

public class TestStudent4 {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student();
        s.insertRecord(121,"Raja ");
        s1.insertRecord(123,"Rajesh");
        s.displayInformation();
        s1.displayInformation();

    }
}
