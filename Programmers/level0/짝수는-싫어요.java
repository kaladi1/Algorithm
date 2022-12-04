package level0;

class Solution {
    public int[] solution(int n) {
        int[] answer;
        int index = 0;
        
        if(n % 2 == 0) {
            answer = new int[n / 2]; // n이 짝수일경우 answer 배열의 크기
        } else {
            answer = new int[n / 2 + 1]; // n이 홀수일경우
        }
        
        for(int i = 0; i <= n; i++) {
            if(i % 2 == 1) {
                answer[index] = i;
                index++;
            }
        }
        return answer;
    }
}