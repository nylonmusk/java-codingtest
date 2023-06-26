import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int N;
    static int M;
    static int[] sequence;
    static StringBuilder answer = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        sequence = new int[M];
        recursion(0);
        System.out.println(answer);
    }

    private static void recursion(int depth) {
        if (depth == M) {
            for (int i : sequence) {
                answer.append(i).append(" ");
            }
            answer.append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
                sequence[depth] = i;
                recursion(depth + 1);
        }
    }
}