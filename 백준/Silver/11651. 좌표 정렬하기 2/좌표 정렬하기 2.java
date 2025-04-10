import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [][] arr = new int [n][2];

        for (int i=0; i<n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, (arr1, arr2) -> {
            if (arr1[1] == arr2[1]) {
                return arr1[0] - arr2[0];
            } else {
                return arr1[1] - arr2[1];
            }
        });

        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}