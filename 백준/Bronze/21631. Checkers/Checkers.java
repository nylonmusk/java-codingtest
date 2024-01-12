import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long white = Long.parseLong(st.nextToken());
        long black = Long.parseLong(st.nextToken());

        System.out.println(calculateMaxBlackStripes(white, black));
        br.close();
    }

    private static long calculateMaxBlackStripes(long white, long black) {
        if (black == 0) {
            return 0;
        } else if (white == 0) {
            return 1;
        } else {
            return Math.min(black, white + 1);
        }
    }
}
