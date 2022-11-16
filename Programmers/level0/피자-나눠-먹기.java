package level0;

import java.lang.Math;

class Solution {
    public int solution(int n) {
        int answer = 0;
        double result = 0d;
  
            result = (double) n/7;
            
            answer = (int) Math.ceil(result);
        
        
        return answer;
        }
    }