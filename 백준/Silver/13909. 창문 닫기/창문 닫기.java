import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;

        for (int i=1; i*i<=n; i++) {
            result++;
        }

        System.out.println(result);
    }
}