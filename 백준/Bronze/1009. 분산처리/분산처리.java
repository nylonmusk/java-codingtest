import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int lastComputer = 1;
            for (int i = 0; i < b; i++) {
                lastComputer = (lastComputer * a) % 10;
                if (lastComputer == 0) {
                    lastComputer = 10;
                }
            }
            answer.append(lastComputer).append('\n');
        }
        System.out.print(answer);
    }
}