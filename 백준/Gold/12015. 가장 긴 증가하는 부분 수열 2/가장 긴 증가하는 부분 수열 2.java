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
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> answer = new ArrayList<>();
        answer.add(0);

        for (int num : A) {
            if (num > answer.get(answer.size() - 1)) {
                answer.add(num);
            } else {
                int left = 0;
                int right = answer.size() - 1;
                int mid = 0;

                while (left < right) {
                    mid = (left + right) / 2;
                    if (answer.get(mid) < num) {
                        left = mid + 1;
                    } else {
                        right = mid;
                    }
                }

                answer.set(right, num);
            }
        }

        System.out.println(answer.size() - 1);
    }
}
