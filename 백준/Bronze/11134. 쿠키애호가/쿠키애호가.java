import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            long N = sc.nextLong();
            long C = sc.nextLong();
            long days = (N + C - 1) / C;
            System.out.println(days);
        }
    }
}