package level0;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int priceN = 12000;
        int priceK = 2000;
        int service = (int)n / 10;
        
        if(n < 10) {
            n = priceN * n;
            k = priceK * k;
            
            answer = n + k;
        } else {
            n = priceN * n;
            k = (priceK * k) - (service * priceK);
            
            answer = n + k;
        }
        
        return answer;
    }
}