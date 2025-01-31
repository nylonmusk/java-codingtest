import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = Integer.MIN_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (n-- > 0) {
            answer = Math.max(answer, Integer.parseInt(st.nextToken()));
        }

        System.out.println(answer);
    }
}