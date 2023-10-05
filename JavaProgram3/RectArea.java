package Javaprogram;
class Ractangle {
    int length,width;
    void getData(int x, int y){
        length = x;
        width = y;
    }
    void Rect(){
        int result = length * width;
        System.out.println("Area="+Result);
    }
}

public class RectArea {
    public static void main(String[] args) {
        Rectangle ob = new Rectangle();
        ob.getData(10,20);
        ob.Rect();
    }
}
