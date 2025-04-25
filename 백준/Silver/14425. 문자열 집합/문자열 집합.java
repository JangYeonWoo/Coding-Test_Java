import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        String [] arr = new String [num1];
        int cnt = 0;

        for (int i=0; i<num1; i++) {
            arr[i] = sc.next();
        }

        for (int i=0; i<num2; i++) {
            String str = sc.next();

            for (int j=0; j<arr.length; j++) {
                if (str.equals(arr[j])) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}