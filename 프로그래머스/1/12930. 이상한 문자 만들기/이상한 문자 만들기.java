class Solution {
    public String solution(String s) {
        String answer = "";
        String [] str = s.split(" ", -1);

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                char a = str[i].charAt(j);
                if (j % 2 != 0) {
                    answer += Character.toLowerCase(a);
                } else {
                    answer += Character.toUpperCase(a);
                }
            }
            answer += " ";
        }
        answer = answer.substring(0, answer.length()-1);

        return answer;
    }
}