import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int answer = 0;

        while (S >= 2 && A >= 2) {
            S -= 2;
            A -= 2;
            answer++;
        }

        System.out.println(answer);
    }
}