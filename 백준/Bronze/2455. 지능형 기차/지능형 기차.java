import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int train = 0;
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            int gotOut = Integer.parseInt(st.nextToken());
            int gotIn = Integer.parseInt(st.nextToken());
            train += gotIn;
            train -= gotOut;
            answer = Math.max(answer, train);
        }

        System.out.print(answer);
    }
}
