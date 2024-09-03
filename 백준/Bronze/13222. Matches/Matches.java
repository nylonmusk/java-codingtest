import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int W = Integer.parseInt(firstLine[1]);
        int H = Integer.parseInt(firstLine[2]);

        double maxLength = Math.sqrt(W * W + H * H);

        for (int i = 0; i < N; i++) {
            int matchLength = Integer.parseInt(br.readLine());

            if (matchLength <= maxLength) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}