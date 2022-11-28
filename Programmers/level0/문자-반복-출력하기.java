package level0;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] char1 = my_string.toCharArray();
        
        for(int i = 0; i < char1.length; i++) {
            for(int j = 0; j < n; j++) {
                answer += char1[i];
            }
        }
        return answer;
    }
}