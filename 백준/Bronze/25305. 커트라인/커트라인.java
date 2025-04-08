import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];

        for (int i=0; i<n; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        Arrays.sort(arr);
        System.out.println(arr[n-1-k+1]);
    }
}