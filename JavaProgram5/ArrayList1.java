import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        // yaha pe add karenge new array ko add new element
        l1.add(2);
        l1.add(5);
        l1.add(6);
        
        // print of index value
        System.out.println(l1.get(1));

        // print of list
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+", ");
        }
        // print the arrayList
        System.out.println(l1);

        // chage the element
        l1.set(1, 15);
        System.out.println(l1);

        // access the element
        l1.get(1);
        System.out.println(l1);

        // shift the element
        l1.add(2, 25);
        l1.add(1, 56);
        System.out.println(l1);

        // remove the element
        l1.remove(2);
        System.out.println(l1);

        // remove by without index - value to remove
        l1.remove(Integer.valueOf(6));
        System.out.println(l1);

        // chek in element exists
        boolean ans = l1.contains(Integer.valueOf(56));
        System.out.println(ans); // true- because [2, 56, 25] me 56 exists karta h

        // chek in element not exists
        boolean fans = l1.contains(Integer.valueOf(100));
            System.out.println(fans); // false - because [2, 56, 25] me 100 exists nahi karta h
        
// without <wrapclass> use ArrayList any primitive data type
            ArrayList l2 = new ArrayList();
            l2.add("raja");
            l2.add(1);
            l2.add(true);
            System.out.println(l2);
    }
}
