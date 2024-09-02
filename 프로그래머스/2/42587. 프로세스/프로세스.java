import java.util.*;

class Process {
    int location;
    int priority;
    
    Process(int location, int priority){
        this.location = location;
        this.priority = priority;
    }
}

class Solution {
    public int solution(int[] priorities, int location) {
        
        Queue<Process> queue = new LinkedList();
        for (int i=0; i < priorities.length; i++){
            queue.offer(new Process(i, priorities[i]));
        }
        
        Arrays.sort(priorities);
        
        int index = priorities.length -1;
        while (!queue.isEmpty()){
            Process process = queue.poll();
            if (process.priority == priorities[index]){
                if (process.location == location) return priorities.length - index;
                index--;
            }
            queue.offer(process);
        }
        return index;
    }
}
