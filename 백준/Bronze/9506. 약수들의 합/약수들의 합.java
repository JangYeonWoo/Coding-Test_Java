import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            int sum = 0;
            List<Integer> arr = new ArrayList<>();

            if (n == -1) break;

            for (int i=1; i<=n; i++) {
                if (n % i == 0) {
                    sum += i;
                    arr.add(i);
                }
            }
            sum -= n;

            if (n == sum) {
                System.out.print(n + " =");
                for (int i=0; i<arr.size()-1; i++) {
                    System.out.print(" " + arr.get(i));
                    if (i != arr.size()-2) {
                        System.out.print(" +");
                    }
                }
                System.out.println();
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}