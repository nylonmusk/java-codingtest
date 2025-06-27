import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int prevA = -1, prevB = -1;
        boolean isChronological = true;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (i > 0) {
                if (a < prevA || b < prevB) {
                    isChronological = false;
                    break;
                }
            }

            prevA = a;
            prevB = b;
        }

        System.out.println(isChronological ? "yes" : "no");
    }
}