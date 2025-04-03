import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> arr = new ArrayList<>();

        for (int i=1; i<=n; i++) {
            if (n %  i == 0) {
                arr.add(i);
            }
        }

        for (int i=0; i<arr.size(); i++) {
            if (arr.size() < k) {
                System.out.println("0");
                break;
            } else {
                if (arr.get(i) != 0) {
                    System.out.print(arr.get(k-1));
                    break;
                }
            }
        }
    }
}