import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<int[]> lines = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            lines.add(new int[]{start, end});
        }

        lines.sort(Comparator.comparingInt(a -> a[0]));

        int answer = 0;
        int currentStart = lines.get(0)[0];
        int currentEnd = lines.get(0)[1];

        for (int i = 1; i < N; i++) {
            int start = lines.get(i)[0];
            int end = lines.get(i)[1];

            if (start <= currentEnd) {
                currentEnd = Math.max(currentEnd, end);
            } else {
                answer += (currentEnd - currentStart);
                currentStart = start;
                currentEnd = end;
            }
        }

        answer += (currentEnd - currentStart);

        System.out.println(answer);
    }
}