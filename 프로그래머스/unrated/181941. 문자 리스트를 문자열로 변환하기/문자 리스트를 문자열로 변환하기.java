class Solution {
    public String solution(String[] arr) {
        String answer = ""; 
        
        for(int i=0; i<arr.length; i++) {
            answer += String.valueOf(arr[i]);
        }
        return answer;
    }
}