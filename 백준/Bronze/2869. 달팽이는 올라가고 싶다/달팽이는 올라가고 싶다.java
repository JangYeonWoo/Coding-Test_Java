import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int sum =  (num3 - num2) / (num1 - num2);
        
        if ((num3 - num2) % (num1 - num2) != 0) {
            sum++;
        }

        System.out.println(sum);
    }
}