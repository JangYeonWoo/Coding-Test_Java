import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String str = "*";
        int odd = 1;


        for (int i=0; i<num; i++) {
            for (int j=num-1; j>i; j--) {
                System.out.print(" ");
            }
            for (int k=0; k<odd; k++) {
                System.out.print(str);
            }
            odd += 2;
            System.out.println();
        }
        odd -= 4;
        for (int i=num-1; i>0; i--) {
            for (int j=i; j<num; j++) {
                System.out.print(" ");
            }
            for (int k=odd; k>0; k--) {
                System.out.print(str);
            }
            odd -= 2;
            System.out.println();
        }

    }
}