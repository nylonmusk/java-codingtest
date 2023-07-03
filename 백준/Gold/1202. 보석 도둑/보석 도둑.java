import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Jewelry {
    int M, V;

    Jewelry(int M, int V) {
        this.M = M;
        this.V = V;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Jewelry> jewelries = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            jewelries.add(new Jewelry(M, V));
        }

        List<Integer> bags = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            bags.add(Integer.parseInt(br.readLine()));
        }

        jewelries.sort((a, b) -> a.M - b.M);
        bags.sort((a, b) -> a - b);

        long answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        int idx = 0;
        for (int bag : bags) {
            while (idx < N && jewelries.get(idx).M <= bag) {
                pq.add(jewelries.get(idx).V);
                idx++;
            }

            if (!pq.isEmpty()) {
                answer += pq.poll();
            }
        }
        System.out.println(answer);
    }
}
