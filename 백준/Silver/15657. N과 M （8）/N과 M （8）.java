import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main {
    static int N;
    static int M;
    static int[] sequence;
    static List<Integer> nums = new ArrayList<>();
    static StringBuilder answer = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums.add(Integer.parseInt(st.nextToken()));
        }
        nums.sort((a, b) -> a - b);
        sequence = new int[M];

        recursion(0, 0);
        System.out.println(answer);
    }

    private static void recursion(int start, int depth) {
        if (depth == M) {
            for (int i : sequence) {
                answer.append(i).append(" ");
            }
            answer.append("\n");
            return;
        }

        for (int i = start; i < N; i++) {
            sequence[depth] = nums.get(i);
            recursion(i, depth + 1);
        }
    }
}
