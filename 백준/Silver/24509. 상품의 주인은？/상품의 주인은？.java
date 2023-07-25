import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] students = new int[N + 1][4];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int ii = Integer.parseInt(st.nextToken());
            for (int j = 0; j < 4; j++) {
                students[ii][j] = Integer.parseInt(st.nextToken());
            }
        }

        List<Integer> answer = new ArrayList<>();

        for (int j = 0; j < 4; j++) {
            int maxScore = Integer.MIN_VALUE;
            int number = 0;
            for (int i = 1; i <= N; i++) {
                if (maxScore < students[i][j] && !answer.contains(i)) {
                    maxScore = students[i][j];
                    number = i;
                }
            }
            answer.add(number);
        }

        for (int num : answer) {
            System.out.print(num + " ");
        }
    }
}
