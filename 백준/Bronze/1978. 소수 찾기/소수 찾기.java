import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 0;
        int result = 0;

        for (int i=1; i<=n; i++) {
            num = sc.nextInt();

            int count = 0;
            for (int j=1; j<=num; j++) {
                if (num % j == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                result += 1;
            }
        }

        System.out.println(result);
    }
}