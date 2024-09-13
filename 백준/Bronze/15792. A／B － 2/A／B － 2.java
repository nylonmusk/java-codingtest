import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder answer = new StringBuilder();
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        answer.append(A / B + ".");
        A = 10 * (A - B * (A / B));
        int T = 1500;
        while (T-- > 0) {
            answer.append(A / B + "");
            A = 10 * (A - B * (A / B));
        }
        System.out.println(answer);
    }

}