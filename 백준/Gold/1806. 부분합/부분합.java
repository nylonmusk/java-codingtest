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
        int answer = Integer.MAX_VALUE;
        int sum = 0;
        while (true) {
            if (sum >= M) {
                answer = Math.min(answer, end - start);
                sum -= arr[start];
                start++;
            } else if (end == N) {
                break;
            } else {
                sum += arr[end];
                end++;
            }
        }
        System.out.println(answer == Integer.MAX_VALUE ? 0 : answer);
    }
}
