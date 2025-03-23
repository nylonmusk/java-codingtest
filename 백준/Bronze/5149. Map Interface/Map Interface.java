import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        int K = Integer.parseInt(br.readLine());

        for (int k = 1; k <= K; k++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[][] stations = new int[n][2];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                stations[i][0] = Integer.parseInt(st.nextToken());
                stations[i][1] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            int minX = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE;
            int minY = Integer.MAX_VALUE, maxY = Integer.MIN_VALUE;

            Set<Integer> visited = new HashSet<>();
            for (int i = 0; i < m; i++) {
                int stationIndex = Integer.parseInt(st.nextToken()) - 1;
                visited.add(stationIndex);
                minX = Math.min(minX, stations[stationIndex][0]);
                maxX = Math.max(maxX, stations[stationIndex][0]);
                minY = Math.min(minY, stations[stationIndex][1]);
                maxY = Math.max(maxY, stations[stationIndex][1]);
            }

            int count = 0;
            for (int i = 0; i < n; i++) {
                int x = stations[i][0], y = stations[i][1];
                if (minX <= x && x <= maxX && minY <= y && y <= maxY) {
                    count++;
                }
            }

            answer.append("Data Set ").append(k).append(":\n").append(count).append("\n\n");
        }

        System.out.print(answer);
    }
}