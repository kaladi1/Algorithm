package level0;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length]; // 배열길이 설정
        
        
        for(int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
            // 또는 answer.push(numbers[i] * 2);
        }
        
        return answer;
    }
}