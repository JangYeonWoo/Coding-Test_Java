import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        for (int i=num1; i<=num2; i++) {
            int count = 0;

            for (int j=1; j<=i; j++) {
                if (i % j == 0) {
                    count += 1;
                }
            }

            if (count == 2) {
                arr.add(i);
            }
        }

        int sum = 0;

        if (!arr.isEmpty()) {
            for (int i=0; i<arr.size(); i++) {
                sum += arr.get(i);
            }
            System.out.println(sum);
            System.out.println(arr.get(0));
        } else {
            System.out.println("-1");
        }
    }
}