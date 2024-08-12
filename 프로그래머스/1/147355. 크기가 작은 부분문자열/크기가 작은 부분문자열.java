class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        int pLength = p.length();
        long pValue = Long.parseLong(p);
        
        for (int i = 0; i <= t.length() - pLength; i++) {
            long tValue = Long.parseLong(t.substring(i, i + pLength));
            if (tValue <= pValue)
                answer++;
        }
        return answer;
    }
}