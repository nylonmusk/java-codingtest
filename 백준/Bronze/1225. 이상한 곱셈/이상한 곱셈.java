import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();

        long answer = 0;
        for (char a : A.toCharArray()) {
            for (char b : B.toCharArray()) {
                answer += (a - 48) * (b - 48);
            }
        }
        System.out.println(answer);
    }
}