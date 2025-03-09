
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [][] array = new char[5][15];
        String str = "";

        for (int k=0; k<array.length; k++ ) {
            str = sc.next();
            for (int l=0; l<str.length(); l++) {
                array[k][l] = str.charAt(l);
            }
        }
        for (int k=0; k<15; k++) {
            for (int l=0; l<5; l++) {
                if (array[l][k] == '\0') continue;
                System.out.print(array[l][k]);
            }
        }
    }

}