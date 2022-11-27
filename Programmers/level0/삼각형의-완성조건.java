package level0;

class Solution {
    public int solution(int[] sides) {
        int answer = 2;
        int index = 0;
        int max = 0;
        for(int i=0;i<sides.length;i++) {
            if(max < sides[i]) {
                max = sides[i];
                index = i;
            }
        }
        max = 0;
        for(int i=0;i<sides.length;i++) {
            if(index == i) {
                continue;
            }
            max += sides[i];
        }
        if(sides[index] < max) {
            answer = 1;
        }
        return answer;
    }
}