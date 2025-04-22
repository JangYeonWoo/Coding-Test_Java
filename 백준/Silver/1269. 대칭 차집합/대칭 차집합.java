import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();

        int cnt = 0;

        for (int i=0; i<num1; i++) {
            A.add(sc.nextInt());
        }

        for (int i=0; i<num2; i++) {
            B.add(sc.nextInt());
        }

        for (int i : A) {
            if (!B.contains(i)) {
                cnt++;
            }
        }

        for (int i : B) {
            if (!A.contains(i)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}