
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        for (int i=0; i<num1; i++) {
            int num2 = sc.nextInt();

            int qcnt = num2 / 25;
            num2 %= 25;
            int dcnt = num2 / 10;
            num2 %= 10;
            int ncnt = num2 / 5;
            num2 %= 5;
            int pcnt = num2;
            num2 %= 1;

            System.out.println(qcnt + " " + dcnt + " " + ncnt + " " + pcnt);
        }
    }

}