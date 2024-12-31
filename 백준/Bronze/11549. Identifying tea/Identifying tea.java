import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 0;
        for (int i = 0; i < 5; i++) {
            if (Integer.parseInt(st.nextToken()) == T) {
                answer++;
            }
        }

        System.out.println(answer);
        
    }
}