import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] students = new int[6][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken()) - 1;
            students[grade][gender]++;
        }

        int rooms = 0;
        for (int grade = 0; grade < 6; grade++) {
            for (int gender = 0; gender < 2; gender++) {
                if (students[grade][gender] > 0) {
                    rooms += (students[grade][gender] + K - 1) / K;
                }
            }
        }

        System.out.println(rooms);
    }
}