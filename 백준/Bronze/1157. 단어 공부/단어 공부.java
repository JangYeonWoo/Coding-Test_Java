
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[26];
        String str = sc.next();

        for (int i=0; i<str.length(); i++ ) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                array[str.charAt(i) - 'A']++;
            } else {
                array[str.charAt(i) - 'a']++;
            }
        }

        int max = -1;
        char ch = '?';

        for (int j=0; j<26; j++) {
            if (array[j] > max) {
                max = array[j];
                ch = (char)(j+65);
            } else if (array[j] == max){
                ch = '?';
            }
        }
        System.out.print(ch);
    }

}