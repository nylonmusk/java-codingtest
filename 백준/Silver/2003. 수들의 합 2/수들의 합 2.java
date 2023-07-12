import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int start = 0;
        int end = 0;
        int count = 0;
        while (start < N && end < N) {
            int answer = 0;
            for (int i = start; i <= end; i++) {
                answer += arr[i];
            }

            if (answer > M) {
                start++;
            } else if (answer < M) {
                end++;
            } else {
                count++;
                start++;
            }
        }
        System.out.println(count);
    }
}
