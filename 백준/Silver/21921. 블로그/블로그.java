import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        List<Integer> visitors = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            visitors.add(Integer.parseInt(st.nextToken()));
        }

        int start = 0;
        int end = X;

        int maxVisitors = Integer.MIN_VALUE;
        int count = 1;
        int sum = 0;

        for (int i = 0; i < X; i++) {
            sum += visitors.get(i);
        }

        while (end <= N) {
            if (sum > maxVisitors) {
                maxVisitors = sum;
                count = 1;
            } else if (sum == maxVisitors) {
                count++;
            }
            if (end == N) break;

            sum -= visitors.get(start++);
            sum += visitors.get(end++);
        }

        System.out.println(maxVisitors == 0 ? "SAD" : maxVisitors + "\n" + count);
    }
}