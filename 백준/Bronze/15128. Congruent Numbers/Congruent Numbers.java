import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long p1 = Long.parseLong(st.nextToken());
        long q1 = Long.parseLong(st.nextToken());
        long p2 = Long.parseLong(st.nextToken());
        long q2 = Long.parseLong(st.nextToken());

        long numerator = p1 * p2;
        long denominator = 2 * q1 * q2;

        if (numerator % denominator == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}