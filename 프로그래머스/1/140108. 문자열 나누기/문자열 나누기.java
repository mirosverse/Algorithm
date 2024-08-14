class Solution {
    public int solution(String s) {
          char x = s.charAt(0);
        int xCount=1, nxCount=0, answer=1;
        for (int i = 1; i < s.length(); i++) {
            if (x==s.charAt(i)) xCount++;
            else nxCount++;
            if(xCount==nxCount){
                if (i+1==s.length()) {
                    break;
                }
                answer++;
                x = s.charAt(i+1);
                xCount=1;
                nxCount=0;
                i++;
            }
        }
        return answer;
    }
}