import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();

        for (int i=0; i<n; i++) {
            set.add(sc.nextInt());
        }

        int m = sc.nextInt();
        int [] arr = new int [m];

        for (int i=0; i<m; i++) {
            int num = sc.nextInt();

            if (set.contains(num)) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}