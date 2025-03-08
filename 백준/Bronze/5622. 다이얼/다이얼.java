import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'A' || a.charAt(i) == 'B' || a.charAt(i) == 'C') {
                count += 3;
            } else if (a.charAt(i) == 'D' || a.charAt(i) == 'E' || a.charAt(i) == 'F') {
                count += 4;
            } else if (a.charAt(i) == 'G' || a.charAt(i) == 'H' || a.charAt(i) == 'I') {
                count += 5;
            } else if (a.charAt(i) == 'J' || a.charAt(i) == 'K' || a.charAt(i) == 'L') {
                count += 6;
            } else if (a.charAt(i) == 'M' || a.charAt(i) == 'N' || a.charAt(i) == 'O') {
                count += 7;
            } else if (a.charAt(i) == 'P' || a.charAt(i) == 'Q' || a.charAt(i) == 'R' || a.charAt(i) == 'S') {
                count += 8;
            } else if (a.charAt(i) == 'T' || a.charAt(i) == 'U' || a.charAt(i) == 'V') {
                count += 9;
            } else {
                count += 10;
            }
        }
        System.out.print(count);
    }

}