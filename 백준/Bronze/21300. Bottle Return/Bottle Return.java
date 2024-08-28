import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 0;

        while (st.hasMoreTokens()) {
            int count = Integer.parseInt(st.nextToken());
            answer += count * 5;
        }

        System.out.println(answer);
    }
}