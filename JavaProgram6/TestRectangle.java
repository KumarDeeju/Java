class Rectangle {
    int length;
    int width;

    void Area(int l, int h){
    length = l;
    width = h;
    }

    void Display(){
        System.out.println(length*width);
    }
}

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.Area(25, 15);
        r2.Area(56,25);

        r1.Display();
        r2.Display();
    }
}
