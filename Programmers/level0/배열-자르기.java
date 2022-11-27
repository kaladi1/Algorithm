package level0;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1]; // (num2 - num1) +1 개여야 배열의 갯수가 맞음
        int indexNum = 0;
        
        for(int i = num1; i <= num2; i++) {
            answer[indexNum] = numbers[i];
            indexNum++;
        }
        
        return answer;
    }
}