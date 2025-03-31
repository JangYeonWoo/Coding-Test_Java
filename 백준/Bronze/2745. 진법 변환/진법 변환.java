import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int num = sc.nextInt();
        int sum = 0;
        int mul = 1;

        for (int i=str.length()-1; i>=0; i--) {
            char c = str.charAt(i);

            if ('A' <= c && c <= 'Z') {
                sum += (c - 'A' + 10) * mul;
            } else {
                sum += (c - '0') * mul;
            }
            mul *= num;
        }

        System.out.println(sum);
    }
}