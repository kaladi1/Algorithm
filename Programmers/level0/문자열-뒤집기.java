package level0;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        StringBuffer sb = new StringBuffer(my_string);
        answer = sb.reverse().toString();
        
        return answer;
        
        // StringBuffer 와 reverse()를 이용.
        // reverse() 메소드는 StringBuffer 객체를 반환 하기때문에 toString() 함수를 이용해 String으로 변환
    }
}