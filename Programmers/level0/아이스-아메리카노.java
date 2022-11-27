package level0;

class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int price = 5500;
        
        answer[0] = (int) money / price;
        answer[1] = money - (answer[0] * price);
        
        
        
        return answer;
    }
}