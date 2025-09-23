import java.util.Arrays;
import java.util.Collections;
class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());

        for (int i = 0; i < str.length; i++) {
            answer.append(str[i]);
        }
        return answer.toString();
    }
}