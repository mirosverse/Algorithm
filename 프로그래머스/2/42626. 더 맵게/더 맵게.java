import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> foods = new PriorityQueue();
        
        for (int scv : scoville) {
            foods.offer(scv);
        }
        
        int answer = 0;
        while (foods.size() >= 2 && foods.peek() < K){
            answer++;
            foods.offer(foods.poll()+foods.poll()*2);
        }
        
        if(foods.peek() < K) return -1;
        
        return answer;
    }
}