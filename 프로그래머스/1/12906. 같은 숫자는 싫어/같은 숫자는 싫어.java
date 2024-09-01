import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack();
        
        for (int n : arr){
            if (!stack.isEmpty()  && stack.peek() == n) continue;
            stack.push(n);
        }
        
        return stack.stream().mapToInt(i->i).toArray();
    }
}