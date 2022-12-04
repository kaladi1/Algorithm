package level0;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int ten = 10;
        
        while(n > 0) {
            answer += n % ten;
            n /= ten;
        }
        return answer;
    }
}