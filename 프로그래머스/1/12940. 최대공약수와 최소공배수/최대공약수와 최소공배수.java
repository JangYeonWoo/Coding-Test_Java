class Solution {
    public int[] solution(int n, int m) {
        int gcd = getGCD(n, m);
        int lcm = (n * m) / gcd;

        int[] answer = new int [2];

        answer[0] = gcd;
        answer[1] = lcm;

        return answer;
    }
    
    public static int getGCD(int n, int m) {
        if (n % m == 0) {
            return m;
        }
        return getGCD(m, n%m);
    }
}