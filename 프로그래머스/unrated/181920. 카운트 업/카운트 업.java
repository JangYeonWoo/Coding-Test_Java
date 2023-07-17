class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end-start+1];
        answer[0] = start;
        
        for(int i=1; i<=end-start; i++) {
            answer[i] = start+i;
        }
        
        return answer;
    }
}