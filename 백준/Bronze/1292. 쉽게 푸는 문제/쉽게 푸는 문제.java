import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int idx = 0;
        int num = 1;
        int sum = 0;

        while (idx < B) {
            for (int i = 0; i < num && idx < B; i++) {
                idx++;
                if (idx >= A) sum += num;
            }
            num++;
        }

        System.out.println(sum);
    }
}