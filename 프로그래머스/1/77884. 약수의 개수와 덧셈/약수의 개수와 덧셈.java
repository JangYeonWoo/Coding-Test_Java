import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum += 1;
                }
            }
            list.add(sum);
        }

        for (int i = 0; i < list.size(); i++) {
            int num = left;
            if (list.get(i) % 2 == 0) {
                answer += num;
            } else {
                answer -= num;
            }
            left += 1;
        }
        return answer;
    }
}