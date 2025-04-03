import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int cnt = 1;
        int repeat = 2;

        if (num == 1) {
            System.out.println("1");
        } else {
            while (repeat <= num) {
                repeat = repeat + (cnt * 6);
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}