import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            System.out.println(getPointCount(x1, y1, r1, x2, y2, r2));
        }
    }

    public static int getPointCount(int x1, int y1, int r1, int x2, int y2, int r2) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        double distance = Math.sqrt(dx * dx + dy * dy);

        if (distance == 0 && r1 == r2) {
            return -1;
        }
        else if (distance == r1 + r2 || distance == Math.abs(r1 - r2)) {
            return 1;
        }
        else if (Math.abs(r1 - r2) < distance && distance < r1 + r2) {
            return 2;
        }
        else {
            return 0;
        }
    }
}