import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int answer = 0;

        for (int i = 0; i < n; i++) {
            answer += Integer.parseInt(st.nextToken()) / A;
        }

        System.out.println(answer);
    }
}