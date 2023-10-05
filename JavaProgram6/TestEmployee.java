class Employee{
    String name;
    int id;
    float Salary;
    
    void Refrence(String n,int i,float S){
        name = n;
        id = i;
        Salary = S;

    }
    void displayInformation(){
        System.out.println(name+" "+id+" "+Salary);
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Employee E1 = new Employee();
        Employee E2 = new Employee();
        Employee E3 = new Employee();

        E1.Refrence("Raja", 02, 25000);
        E2.Refrence("Rajan", 05, 28000);
        E3.Refrence("Roshan", 29, 35000);
       
        E1.displayInformation();
        E2.displayInformation();
        E3.displayInformation();
    }
}
