import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int [] x = new int [num];
        int [] y = new int [num];

        for (int i=0; i<num; i++) {
            int ix = sc.nextInt();
            int iy = sc.nextInt();

            x[i] = ix;
            y[i] = iy;
        }

        Arrays.sort(x);
        Arrays.sort(y);

        if (num <= 1) {
            System.out.println("0");
        } else {
            System.out.println((x[x.length-1] - x[0]) * (y[y.length-1] - y[0]));
        }
    }
}