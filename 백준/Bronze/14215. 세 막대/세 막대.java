import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int max = Math.max(Math.max(num1, num2), num3);
        int sum = num1 + num2 + num3 - max;

        if (max < sum) {
            System.out.println(num1+num2+num3);
        } else if (max >= sum) {
            max = sum-1;
            System.out.println(max + sum);
        }

    }
}