import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < N; i++) {
            StringBuilder temp = new StringBuilder();
            temp.append(br.readLine()).reverse();
            answer.append(temp).append("\n");
        }
        System.out.println(answer);
    }
}