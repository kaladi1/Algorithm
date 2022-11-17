package level0;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        for(int i = 0, j = num_list.length -1; j > i; i++, j--) {
           int save = num_list[j];
            num_list[j] = num_list[i];
            num_list[i] = save;
        }
        
        answer = num_list;
        
        return answer;
    }
}