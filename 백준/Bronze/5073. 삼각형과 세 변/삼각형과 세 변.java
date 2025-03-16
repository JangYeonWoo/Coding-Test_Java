     import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int max = Math.max(Math.max(x, y), z);

            if (x == 0 && y == 0 && z == 0) {
                break;
            }
            
            if (max < (x+y+z) - max) {
                if (x == y && y == z) {
                    System.out.println("Equilateral");
                } else if (x == y || y == z || x == z) {
                    System.out.println("Isosceles");
                } else if (x != y && y != z && x != z) {
                    System.out.println("Scalene");
                }
            } else {
                System.out.println("Invalid");
            }
        }
    }

}