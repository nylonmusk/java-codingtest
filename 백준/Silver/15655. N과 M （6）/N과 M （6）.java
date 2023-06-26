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
    static StringBuilder answer = new StringBuilder();
    static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        sequence = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers.add(Integer.parseInt(st.nextToken()));
        }
        numbers.sort((a, b) -> a - b);
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
            sequence[depth] = numbers.get(i);
            recursion(i + 1, depth + 1);
        }
    }
}