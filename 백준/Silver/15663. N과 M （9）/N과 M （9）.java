import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    static int N;
    static int M;
    static int[] sequence;
    static boolean[] visited;
    static List<Integer> numbers = new ArrayList<>();
    static TreeSet<List<Integer>> treeSet = new TreeSet<>((list1, list2) -> {
        int size = Math.min(list1.size(), list2.size());
        for (int i = 0; i < size; i++) {
            int num1 = list1.get(i);
            int num2 = list2.get(i);
            if (num1 != num2) {
                return Integer.compare(num1, num2);
            }
        }
        return Integer.compare(list1.size(), list2.size());
    });

    public static void main(String[] args) throws IOException {
        StringBuilder answer = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        sequence = new int[M];
        visited = new boolean[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers.add(Integer.parseInt(st.nextToken()));
        }

        numbers.sort(Comparator.comparingInt(a -> a));
        recursion(0);
        for (List<Integer> t : treeSet) {
            for (int i : t) {
                answer.append(i).append(" ");
            }
            answer.append("\n");
        }
        System.out.println(answer);
    }

    private static void recursion(int depth) {
        if (depth == M) {
            List<Integer> list = new ArrayList<>();
            for (int i : sequence) {
                list.add(i);
            }
            treeSet.add(list);
            return;
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                sequence[depth] = numbers.get(i);
                recursion(depth + 1);
                visited[i] = false;
            }
        }
    }
}
