import java.util.*;
import java.util.Arrays;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>(); // Store indices
        
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] temperatures = new int[size];
        for(int i=0;i<size;i++){
            temperatures[i] = sc.nextInt();
        }
        DailyTemperatures solution = new DailyTemperatures();
        int[] answer = solution.dailyTemperatures(temperatures);
        for(int i=0;i<answer.length;i++){
            if(i != answer.length-1){
                System.out.print(answer[i]+",");
            }else{
                System.out.print(answer[answer.length-1]);
            }
        }
    }
}
