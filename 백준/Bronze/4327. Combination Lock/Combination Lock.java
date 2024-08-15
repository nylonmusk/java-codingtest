import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            int third = Integer.parseInt(st.nextToken());

            if (start == 0 && first == 0 && second == 0 && third == 0) {
                break;
            }

            int degrees = 720;
            degrees += ((start - first + 40) % 40) * 9;
            degrees += 360;
            degrees += ((second - first + 40) % 40) * 9;
            degrees += ((second - third + 40) % 40) * 9;
            answer.append(degrees).append("\n");
        }

        System.out.print(answer);
    }
}