import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 2023; i <= N; i++) {
            String serial = String.valueOf(i);
            String target = "2023";
            int targetIdx = 0;

            for (int j = 0; j < serial.length(); j++) {
                if (serial.charAt(j) == target.charAt(targetIdx)) {
                    targetIdx++;
                }
                if (targetIdx == target.length()) {
                    answer++;
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}