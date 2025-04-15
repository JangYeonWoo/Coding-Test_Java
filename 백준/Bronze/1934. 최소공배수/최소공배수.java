import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;

        for (int i=0; i<n; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            result = (num1 * num2) / gcd(num1, num2);
            System.out.println(result);
        }
    }

    public static int gcd (int a, int b) {
        if (a % b == 0) {
            return b;
        }

        return gcd (b, a % b);
    }
}