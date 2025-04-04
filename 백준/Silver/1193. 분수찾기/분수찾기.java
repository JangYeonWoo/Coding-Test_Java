import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int cross = 1;
        int sum = 0;

        while (true) {
            if (num <= sum + cross) {
                if (cross % 2 == 0) {
                    System.out.println((num - sum) + "/" + (cross - (num - sum - 1)));
                    break;
                } else {
                    System.out.println((cross - (num - sum - 1)) + "/" + (num - sum));
                    break;
                }
            } else {
                sum += cross;
                cross++;
            }
        }
    }
}