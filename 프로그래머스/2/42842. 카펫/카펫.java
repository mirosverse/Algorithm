
import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int a = (brown - 4) / 2;
        for(int i = 1; i < a+1 ; i++){
            if(i + (a - i) == a && i*(a - i) ==  yellow){
                if(i >=  a-i){
                    answer[0] = i+2;
                    answer[1] = a-i + 2;
                }else{
                    answer[0] = a-i+2;
                    answer[1] = i+2;
                }
                
                break;
            }
        }
        
        return answer;
    }
}