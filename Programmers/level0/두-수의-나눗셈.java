package level0;

class Solution {
    public int solution(int num1, int num2) {
                
        double division = num1 / (double)num2;
        
        int answer = (int)(division * 1000);
        
        return answer;
        
        // 변수를 double로 바꿔서 연산 후 int로 재변환
    }
}
