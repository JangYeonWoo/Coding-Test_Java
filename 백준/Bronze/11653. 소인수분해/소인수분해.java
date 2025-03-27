import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        if (num1 == 1) {
            System.out.print("");
        } else {
            for (int i=2; i<=num1;) {
                if (num1 % i == 0) {
                    num1 /= i;
                    System.out.println(i);
                } else {
                    i ++;
                }
            }
        }

    }
}