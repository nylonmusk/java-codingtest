import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        while (C-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] students = new int[N];
            int sum = 0;
            for (int i = 0; i < N; i++) {
                int student = Integer.parseInt(st.nextToken());
                students[i] = student;
                sum += student;
            }
            double average = sum / N;
            int overAverage = 0;
            for (int i = 0; i < N; i++) {
                if (students[i] > average) {
                    overAverage++;
                }
            }

            double value = (double) overAverage / N * 100;
            answer.append(String.format("%.3f", value)).append("%").append("\n");
        }
        System.out.println(answer);
    }
}
