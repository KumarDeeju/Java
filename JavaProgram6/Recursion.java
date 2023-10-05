// write the program 1 to n:
public class Recursion {
   static void valueResult(int n){ // coling by man function to / line 12
        if(n == 1){ /* base case(this is base condition)--> yadi n equal to 1(one) hua to line no 
            5 se print ho jayega */
            System.out.println(1);
            return; // ye return stack ko overflow hone se bachata h
        }
        valueResult(n-1); // 6,5,4,3,2,1(n-1,n-2,n-3,n-4.....2,1)
        System.out.println(n); // last print in n value 
}
        public static void main(String[] args) { // main function
            valueResult(6); // here to coling 3 no line
        }

    }
