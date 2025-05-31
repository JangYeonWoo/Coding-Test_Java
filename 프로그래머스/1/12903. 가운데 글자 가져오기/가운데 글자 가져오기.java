class Solution {
    public String solution(String str) {
        String answer = "";
        
        int result = str.length() / 2;

        if (str.length() % 2 == 0) {
            for (int j=result-1; j<=result; j++) {
                answer += String.valueOf(str.charAt(j));
            }
        } else {
            answer = String.valueOf(str.charAt(result));
        }
        
        return answer;
        
    }
}