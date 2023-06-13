import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int size = (int) Math.pow(2, N);
        int result = ZOrder(N, r, c, size);

        System.out.println(result);
    }

    private static int ZOrder(int N, int r, int c, int size) {
        if (N == 0) {
            return 0;
        }

        int halfSize = size / 2;
        int area = halfSize * halfSize;

        if (r < halfSize && c < halfSize) {
            return ZOrder(N - 1, r, c, halfSize);
        } else if (r < halfSize && c >= halfSize) {
            return area + ZOrder(N - 1, r, c - halfSize, halfSize);
        } else if (r >= halfSize && c < halfSize) {
            return 2 * area + ZOrder(N - 1, r - halfSize, c, halfSize);
        } else {
            return 3 * area + ZOrder(N - 1, r - halfSize, c - halfSize, halfSize);
        }
    }
}
