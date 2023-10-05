public class margeTwoArray {
    public static void main(String[] args) {
        int [] a= {33, 34, 23, 31};
        int [] b= {45, 67, 30, 12, 44};
        
        
        int al = a.length;
        int bl = b.length;
        int cl = al + bl;

        int [] c= new int[cl];

        for(int i=0;i<al;i++){
            c[i] = a[i];
        }
        for(int i=0;i<bl;i++){
            c[al+i] = b[i];
        }
        for(int i=0;i<cl;i++){
            //c[i] = c[al+i];
             System.out.print(c[i]+" ");
        }
       
    }
}
