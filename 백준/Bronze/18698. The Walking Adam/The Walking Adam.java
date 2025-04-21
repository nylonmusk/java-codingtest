import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String steps = br.readLine();
            int answer = 0;

            for (int i = 0; i < steps.length(); i++) {
                if (steps.charAt(i) == 'D') {
                    break;
                }
                answer++;
            }

            System.out.println(answer);
        }
    }
}