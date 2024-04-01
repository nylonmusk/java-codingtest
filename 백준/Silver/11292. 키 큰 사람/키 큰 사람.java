import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder answer = new StringBuilder();
        int N;
        while ((N = Integer.parseInt(br.readLine())) != 0) {
            float maxHeight = Float.MIN_VALUE;
            StringBuilder names = new StringBuilder();

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                float height = Float.parseFloat(st.nextToken());
                if (maxHeight < height) {
                    names = new StringBuilder();
                    maxHeight = height;
                    names.append(name).append(" ");
                } else if (maxHeight == height) {
                    names.append(name).append(" ");
                }
            }
            answer.append(names).append("\n");
        }
        System.out.println(answer);
    }
}
