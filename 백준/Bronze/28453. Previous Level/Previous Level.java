import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] levels = new int[N];
        for (int i = 0; i < N; i++) {
            levels[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (levels[i] == 300) {
                answer.append(1).append(" ");
            } else if (levels[i] >= 275) {
                answer.append(2).append(" ");
            } else if (levels[i] >= 250) {
                answer.append(3).append(" ");
            } else {
                answer.append(4).append(" ");
            }
        }
        System.out.println(answer.toString().trim());
    }
}