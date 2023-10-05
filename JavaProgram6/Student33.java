public class Student33 {
    int id;
    String name;
    // method to display the value of id and name 
    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String[] args) {
        // creat object
        Student33 s = new Student33();
        Student33 s1 = new Student33();

        // display the value of the object

        s1.display();
        s.display();
    }
}
