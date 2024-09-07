import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new LinkedList();
        List<Integer> list = new LinkedList();
        for (int a : array) list.add(a);
        
        for (int[] command : commands){
                        System.out.println(list);
            List<Integer> cur = new ArrayList<>( list.subList(command[0]-1, command[1]));    
            Collections.sort(cur);
            answer.add(cur.get(command[2]-1));
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}