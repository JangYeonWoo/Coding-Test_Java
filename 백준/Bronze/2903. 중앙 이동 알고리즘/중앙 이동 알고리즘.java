import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int square = 4;

        int [] arr1 = new int[15];
        int [] arr2 = new int[15];

        int x = 3;
        int y = 2;

        for (int i=0; i<arr1.length; i++) {
            arr1[i] = x;
            arr2[i] = y;

            x += (int)Math.pow(2, i+1);
            y = x - (int)Math.pow(2, i+1);
        }


        for (int i=1; i<=num; i++) {
            square += (arr1[i-1] * (int)Math.pow(2, i-1)) + (arr2[i-1] * (int)Math.pow(2, i-1));
        }

        System.out.println(square);

    }
}