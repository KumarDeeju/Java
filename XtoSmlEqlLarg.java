/*PROBLEM
 Partition the given array based on a pivat value
Given a pivotx, and a list ist partition the list into three parts. The first part contains all elements in bet that are less than x. The second part contains all elements in bt that are equal to x. The third part contains all elements in it that are larger than x Ondering within a part can be arbitrary. The
algorithm should result in minimum swaps
For example given x-10 and it -9 12 3 5 14 10, 101 one partition may be 1953 10 10 14 12
NOTE Overall sorting and printing will not be the right answer since it does not tate minimum swaps
InputFormat
First line of the inputs an integer which is the number of elements in the input array ar
Next lines of input each contains an integer reg renting the elements a
Last line of ingot is a single integer which corressands to the sivat value
OutputFormat
Single line consisting of space separated integers
Constraints:
1-100
010000
Sample Input  array [] = {9, 12, 3, 5, 14, 10, 10}, x = 10
Sample Output
9  5 3  10 10 14 12
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class XtoSmlEqlLarg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int size = sc.nextInt();
        for(int i=0;i<size;i++){
            int n = sc.nextInt();
            list.add(n);
        }
        int x = sc.nextInt();
        ArrayList<Integer> leshThanX = new ArrayList<>();
        ArrayList<Integer> equalX = new ArrayList<>();
        ArrayList<Integer> greatThanX = new ArrayList<>();

        for(int num : list){
            if(num < x){
                leshThanX.add(num);
            }else if(num == x){
                equalX.add(num);
            }else{
                greatThanX.add(num);
            }
        }

        Collections.sort(leshThanX, Collections.reverseOrder());
        for(int num : leshThanX){
            System.out.println(num+" ");
        }
        Collections.sort(equalX, Collections.reverseOrder());
        for(int num : equalX){
            System.out.println(num+" ");
        }
        Collections.sort(greatThanX, Collections.reverseOrder());
        for(int num : greatThanX){
            System.out.println(num+" ");
        }
    }
}

/*INPUT
 * SIZE - 7
ARR = 9 12 3 5 14 10 10   
X = 10
OUTPUT : 
9
5
3
10
10
14
12
 */

