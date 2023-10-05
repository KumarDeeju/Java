class Calculate1 {
    int length;
    int width;

    void Area(int l,int h){
        length = l;
        width = h;
    }

    void CalculateArea(){
        System.out.println(length*width);
    }
    
}

public class Rectangle2 {
    public static void main(String[] args) {
        Calculate1 a1 = new Calculate1();
        Calculate1  a2  = new Calculate1();

        a1.Area(33, 55);
        a2.Area(44, 45);

         a1.CalculateArea();
         a2.CalculateArea();
        }
    }

