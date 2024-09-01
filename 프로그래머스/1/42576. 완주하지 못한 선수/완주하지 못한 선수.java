import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String,Integer> map = new HashMap<>();
        
        for (String par : participant){
            map.put(par,map.getOrDefault(par,0)+1);
        }
        
        for (String com : completion){
            if (map.get(com) == 1) map.remove(com);
            else {
                map.put(com, map.getOrDefault(com, 0)-1);
            }
        }
        return (String)map.keySet().toArray()[0];
    }
}