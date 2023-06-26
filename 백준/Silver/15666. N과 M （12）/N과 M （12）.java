import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int[] sequence;
    static List<Integer> numbers;
    static StringBuilder answer = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        sequence = new int[M];
        Set<Integer> set = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        numbers = new ArrayList<>(set);
        numbers.sort(Comparator.comparingInt(a -> a));
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

        for (int i = start; i < numbers.size(); i++) {
            sequence[depth] = numbers.get(i);
            recursion(i, depth + 1);
        }
    }
}
