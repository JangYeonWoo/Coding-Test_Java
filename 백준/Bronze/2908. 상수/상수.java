import java.util.*;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String i = sc.next();
        String j = sc.next();
        String answer1 = "";
        String answer2 = "";

        for (int k=2; k>=0; k--) {
            answer1 += i.charAt(k)+"";
        }
        for (int k=2; k>=0; k--) {
            answer2 += j.charAt(k)+"";
        }

        if (Integer.valueOf(answer1) > Integer.valueOf(answer2)) {
            System.out.println(answer1);
        } else {
            System.out.println(answer2);
        }
	}
}