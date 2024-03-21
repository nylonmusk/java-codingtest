import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static int[] houses;
    private static int N, C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        houses = new int[N];
        for (int i = 0; i < N; i++) {
            houses[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(houses);

        int start = 1;
        int end = houses[N - 1] - houses[0];
        int answer = 0;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (isValid(mid)) {
                answer = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(answer);
    }

    private static boolean isValid(int distance) {
        int count = 1;
        int now = houses[0];

        for (int i = 1; i < N; i++) {
            if (houses[i] - now >= distance) {
                count++;
                now = houses[i];
            }
        }
        return count >= C;
    }
}
