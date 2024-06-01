import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int A = 0;
        int B = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int AScore = Integer.parseInt(st.nextToken());
            int BScore = Integer.parseInt(st.nextToken());
            if (AScore > BScore) {
                A++;
            } else if (AScore < BScore) {
                B++;
            }
        }

        System.out.println(A + " " + B);
    }
}
