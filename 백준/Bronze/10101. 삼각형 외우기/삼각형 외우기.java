
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x+y+z == 180) {
            if (x == 60 && y == 60 & z == 60) {
                System.out.println("Equilateral");
            } else if (x == y || x == z || y == z) {
                System.out.println("Isosceles");
            } else if (x != y && y != z && x != z) {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }

}