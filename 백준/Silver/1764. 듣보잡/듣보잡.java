import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        HashSet<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<String>();

        for (int i=0; i<num1; i++) {
            set.add(sc.next());
        }

        for (int i=0; i<num2; i++) {
            String str = sc.next();

            if (set.contains(str)) {
                list.add(str);
            }
        }
        
        Collections.sort(list);
        System.out.println(list.size());

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}