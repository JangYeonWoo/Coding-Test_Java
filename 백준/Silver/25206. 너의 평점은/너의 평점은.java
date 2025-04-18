import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] arr = new String[20][3];
        float sum = 0;
        float sub = 0;

        for (int i=0; i<20; i++) {
            arr[i][0] = sc.next();
            arr[i][1] = sc.next();
            arr[i][2] = sc.next();
        }

        for (int i=0; i<arr.length; i++) {
            if (arr[i][2].equals("A+")) {
                sub += Float.parseFloat(arr[i][1]);
                sum += (float) (Float.parseFloat(arr[i][1]) * 4.5);
            } else if (arr[i][2].equals("A0")) {
                sub += Float.parseFloat(arr[i][1]);
                sum += (float) (Float.parseFloat(arr[i][1]) * 4.0);
            } else if (arr[i][2].equals("B+")) {
                sub += Float.parseFloat(arr[i][1]);
                sum += (float) (Float.parseFloat(arr[i][1]) * 3.5);
            } else if (arr[i][2].equals("B0")) {
                sub += Float.parseFloat(arr[i][1]);
                sum += (float) (Float.parseFloat(arr[i][1]) * 3.0);
            } else if (arr[i][2].equals("C+")) {
                sub += Float.parseFloat(arr[i][1]);
                sum += (float) (Float.parseFloat(arr[i][1]) * 2.5);
            } else if (arr[i][2].equals("C0")) {
                sub += Float.parseFloat(arr[i][1]);
                sum += (float) (Float.parseFloat(arr[i][1]) * 2.0);
            } else if (arr[i][2].equals("D+")) {
                sub += Float.parseFloat(arr[i][1]);
                sum += (float) (Float.parseFloat(arr[i][1]) * 1.5);
            } else if (arr[i][2].equals("D0")) {
                sub += Float.parseFloat(arr[i][1]);
                sum += (float) (Float.parseFloat(arr[i][1]));
            } else if (arr[i][2].equals("F")) {
                sub += Float.parseFloat(arr[i][1]);
                sum += (float) (Float.parseFloat(arr[i][1]) * 0.0);
            }
        }
        System.out.printf("%.6f", sum / sub);
    }
}