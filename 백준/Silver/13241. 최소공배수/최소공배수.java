import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num1 = sc.nextInt();
        long num2 = sc.nextInt();

        System.out.println((num1 * num2) / getGCD(num1, num2));

    }

    public static int getGCD(long num1, long num2) {
        if (num1 % num2 == 0) {
            return (int) num2;
        }
        return getGCD(num2, num1%num2);
    }
}