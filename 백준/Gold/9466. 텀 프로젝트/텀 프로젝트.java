import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static int count = 0;
    private static List<List<Integer>> students;
    private static boolean[] visited;
    private static boolean[] finished;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());

            students = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                students.add(new ArrayList<>());
            }

            visited = new boolean[n + 1];
            finished = new boolean[n + 1];
            count = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                int selectedStudent = Integer.parseInt(st.nextToken());
                students.get(i).add(selectedStudent);
            }

            for (int i = 1; i <= n; i++) {
                dfs(i);
            }

            answer.append(n - count).append("\n");
        }

        System.out.print(answer);
    }

    private static void dfs(int i) {
        if (visited[i]) return;

        visited[i] = true;
        int next = students.get(i).get(0);

        if (!visited[next]) {
            dfs(next);
        } else {
            if (!finished[next]) {
                count++;
                for (int j = next; j != i; j = students.get(j).get(0)) {
                    count++;
                }
            }
        }
        finished[i] = true;

    }
}
