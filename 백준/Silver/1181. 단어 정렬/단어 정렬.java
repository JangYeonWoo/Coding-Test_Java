import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<String> list = new ArrayList<>();

        for (int i=0; i<n; i++) {
            list.add(sc.next());
        }

        Set<String> set = new HashSet<>(list);
        list = new ArrayList<>(set);

        Collections.sort(list, (a,b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            } else {
                return a.compareTo(b);
            }
        });

        for (int i=0; i<list.size(); i++) {
             System.out.println(list.get(i));
        }
    }
}