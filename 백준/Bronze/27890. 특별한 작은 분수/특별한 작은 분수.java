import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            if (x % 2 == 0) {
                x = (x / 2) ^ 6;
            } else {
                x = (2 * x) ^ 6;
            }
        }

        System.out.println(x);
    }
}