class Solution {
    public int solution(int num) {
        int answer = 0;
        long temp = num;

        while (true) {
            if (temp == 1) {
                if (answer > 500) {
                    answer = -1;
                }
                break;
            } else if (temp % 2 == 0) {
                temp /= 2;
                answer += 1;
            } else {
                temp = (temp * 3) + 1;
                answer += 1;
            }
        }

        return answer;
    }
}