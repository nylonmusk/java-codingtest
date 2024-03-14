import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] isKnowTruth;
    static Set<Integer> peopleWhoKnowTruth;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        peopleWhoKnowTruth = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        int numberOfKnowTruth = Integer.parseInt(st.nextToken());
        for (int i = 0; i < numberOfKnowTruth; i++) {
            peopleWhoKnowTruth.add(Integer.parseInt(st.nextToken()));
        }

        List<List<Integer>> parties = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            List<Integer> party = new ArrayList<>();
            int num = Integer.parseInt(st.nextToken());
            for (int j = 0; j < num; j++) {
                party.add(Integer.parseInt(st.nextToken()));
            }
            parties.add(party);
        }

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (List<Integer> party : parties) {
            for (int i = 0; i < party.size() - 1; i++) {
                int from = party.get(i);
                int to = party.get(i + 1);
                graph.get(from).add(to);
                graph.get(to).add(from);
            }
        }

        isKnowTruth = new boolean[N + 1];

        for (int person : peopleWhoKnowTruth) {
            bfs(person);
        }

        int answer = 0;
        for (List<Integer> party : parties) {
            boolean canLie = true;
            for (int person : party) {
                if (isKnowTruth[person]) {
                    canLie = false;
                    break;
                }
            }
            if (canLie) answer++;
        }
        System.out.println(answer);
    }

    private static void bfs(int person) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(person);
        isKnowTruth[person] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (int next : graph.get(now)) {
                if (!isKnowTruth[next]) {
                    isKnowTruth[next] = true;
                    queue.offer(next);
                }
            }
        }
    }
}
