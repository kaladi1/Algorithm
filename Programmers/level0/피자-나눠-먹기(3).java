package level0;

class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        double b = 0d;
        
        b = (double) n / slice;
        
        answer =  (int) Math.ceil(b);
        
        return answer;
    }
}