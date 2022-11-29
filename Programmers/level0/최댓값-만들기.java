package level0;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int first = 0;
        int second = 0;
        
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] >= first) {
                first = numbers[i];
            }
        }
        
        for(int j = 0; j < numbers.length; j++) {
                if(numbers[j] >= second) {
                    if(numbers[j] != first && second != first) {
                        second = numbers[j];
                }
            }
        }
         answer = first * second;
        
        return answer;
    }
}