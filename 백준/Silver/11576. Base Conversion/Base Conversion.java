import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine().trim());
        st = new StringTokenizer(br.readLine());

        long value = 0;
        for (int i = 0; i < m; i++) {
            value = value * A + Integer.parseInt(st.nextToken());
        }

        List<Long> result = new ArrayList<>();
        while (value > 0) {
            result.add(value % B);
            value /= B;
        }

        StringBuilder answer = new StringBuilder();
        for (int i = result.size() - 1; i >= 0; i--) {
            answer.append(result.get(i));
            if (i > 0) answer.append(" ");
        }

        System.out.print(answer);
    }
}