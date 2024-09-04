import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> asc = new PriorityQueue();
        PriorityQueue<Integer> des = new PriorityQueue(Collections.reverseOrder());
        
        
        for (int i = 0; i<operations.length; i++){
            if(operations[i].equals("D 1")){
                if (!des.isEmpty()) {
                    asc.remove(des.poll());
                } 
            } else if (operations[i].equals("D -1")){
                if (!asc.isEmpty()) {
                    des.remove(asc.poll());
                }
            } else {
                StringTokenizer st = new StringTokenizer(operations[i]);
                String operation = st.nextToken();
                int number = Integer.parseInt(st.nextToken());
                asc.offer(number);
                des.offer(number);

            }
        }
        
        if(asc.isEmpty()) 
            return new int[]{0,0};
        
        int max = des.peek();
        int min = asc.peek();

        
        return new int[]{max,min};
    }
}