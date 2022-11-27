package level0;

class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        
        if(dot[0] > 0 && dot[1] > 0) {
            // A
            answer = 1;
        } else if (dot[0] < 0 && dot[1] > 0) {
            // B
            answer = 2;
        } else if (dot[0] < 0 && dot[1] < 0) {
            // C
            answer = 3;
        } else if (dot[0] > 0 && dot[1] < 0) {
            // D
            answer = 4;
        }
        
        return answer;
    }
}