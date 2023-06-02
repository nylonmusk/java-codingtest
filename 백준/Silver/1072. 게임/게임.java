import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int Z = getPercent(X, Y);
        int answer = -1;
        int left = 0;
        int right = (int) 1e9;

        while (right >= left) {
            int mid = (left + right) / 2;

            if (getPercent(X + mid, Y + mid) != Z) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(answer);
    }

    private static int getPercent(int X, int Y) {
        return (int) ((long) Y * 100 / X);
    }
}