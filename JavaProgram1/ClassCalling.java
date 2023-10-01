class Rectangle {
    int length, width;

    public void getdata(int x, int y) {
        length = x;
        width = y;
    }

    public void RectArea() {
        int result = length * width;
        System.out.println("Area = " + result);
    }

    public class ClassCalling {
        public static void main(String[] args) {
            Rectangle Rect = new Rectangle();
            Rect.getdata(10,20);
            Rect.RectArea();
        }
    }
}
    
