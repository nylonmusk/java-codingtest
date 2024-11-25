import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int q = Integer.parseInt(firstLine[1]);

        int[] sheetDurations = new int[n];
        for (int i = 0; i < n; i++) {
            sheetDurations[i] = Integer.parseInt(br.readLine());
        }

        int[] cumulativeTime = new int[n];
        cumulativeTime[0] = sheetDurations[0];
        for (int i = 1; i < n; i++) {
            cumulativeTime[i] = cumulativeTime[i - 1] + sheetDurations[i];
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int queryTime = Integer.parseInt(br.readLine());

            for (int j = 0; j < n; j++) {
                if (queryTime < cumulativeTime[j]) {
                    answer.append(j + 1).append("\n");
                    break;
                }
            }
        }

        System.out.print(answer);
    }
}