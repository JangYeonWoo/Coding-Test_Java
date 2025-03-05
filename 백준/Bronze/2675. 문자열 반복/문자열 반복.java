import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i=0; i<num; i++) {
            int num2 = sc.nextInt();
            String a = sc.next();

            for (int j=0; j<a.length(); j++) {
                for (int k=0; k<num2; k++) {
                    System.out.print(a.charAt(j));
                }
            }
            System.out.println();
        }
    }

}