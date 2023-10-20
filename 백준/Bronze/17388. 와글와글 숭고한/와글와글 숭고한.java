import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] participation = new int[3];

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            participation[i] = Integer.parseInt(st.nextToken());
            sum += participation[i];
            min = Math.min(min, participation[i]);
        }
        String answer = "취업하고싶다";
        if (sum >= 100) {
            answer = "OK";
        } else if (min == participation[0]) {
            answer = "Soongsil";
        } else if (min == participation[1]) {
            answer = "Korea";
        } else {
            answer = "Hanyang";
        }
        System.out.println(answer);
    }
}
