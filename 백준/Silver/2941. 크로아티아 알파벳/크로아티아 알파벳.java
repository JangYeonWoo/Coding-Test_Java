import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int length = str.length();

        for (int i=0; i<str.length(); i++) {
            if (str.startsWith("c=", i)) {
                length--;
            } else if (str.startsWith("c-", i)) {
                length--;
            } else if (str.startsWith("dz=", i)) {
                length--;
            } else if (str.startsWith("d-", i)) {
                length--;
            } else if (str.startsWith("lj", i)) {
                length--;
            } else if (str.startsWith("nj", i)) {
                length--;
            } else if (str.startsWith("s=", i)) {
                length--;
            } else if (str.startsWith("z=", i)) {
                length--;
            }
        }
        System.out.println(length);
    }
}