class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String a = my_string.substring(0,s);
        String b = overwrite_string;
        String c = my_string.substring(overwrite_string.length()+s);
        answer = a+b+c;
        
        return answer;
    }
}