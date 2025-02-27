import java.util.*;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String s = sc.next();
        
        int sum = 0;
        
        for (int k = 0; k < i; k++) {
            sum += s.charAt(k)-'0';
        }
        
		System.out.println(sum);
	}
}