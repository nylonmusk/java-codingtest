import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<List<Integer>> students = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            students.add(new ArrayList<>());
        }

        int[] countSmallerStudent = new int[N + 1];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            students.get(A).add(B);
            countSmallerStudent[B]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            if (countSmallerStudent[i] == 0) {
                queue.add(i);
            }
        }

        StringBuilder answer = new StringBuilder();
        while (!queue.isEmpty()) {
            int now = queue.poll();
            answer.append(now).append(" ");

            for (int next : students.get(now)) {
                countSmallerStudent[next]--;
                if (countSmallerStudent[next] == 0) {
                    queue.add(next);
                }
            }
        }
        System.out.println(answer);
    }
}