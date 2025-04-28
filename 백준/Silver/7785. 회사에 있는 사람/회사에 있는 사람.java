import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashSet<String> set = new HashSet<>();

        for (int i=0; i<n; i++) {
            String str1 = sc.next();
            String str2 = sc.next();

            if (str2.equals("enter")) {
                set.add(str1);
            } else {
                set.remove(str1);
            }
        }
        ArrayList<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}