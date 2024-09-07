import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] array = new String[numbers.length];
        for (int i=0;i<numbers.length; i++) array[i] = String.valueOf(numbers[i]);
        
        Arrays.sort(array, (o1,o2)-> (o2+o1).compareTo(o1+o2) );
        
        if(array[0].equals("0")) return "0";
        
        StringBuilder sb = new StringBuilder();
        for (String n : array) sb.append(n);
        return sb.toString();
    }
}