import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(Integer.toString(num, num2).toUpperCase());
    }
}