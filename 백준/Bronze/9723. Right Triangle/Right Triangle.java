import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] sides = new int[3];
            for (int i = 0; i < 3; i++) {
                sides[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(sides);
            if (sides[2] * sides[2] == sides[0] * sides[0] + sides[1] * sides[1]) {
                answer.append("Case #").append(t).append(": YES\n");
            } else {
                answer.append("Case #").append(t).append(": NO\n");
            }
        }
        System.out.print(answer);
    }
}