import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class HideOnBush implements Comparable<HideOnBush> {
    int x;
    int time;

    HideOnBush(int x, int time) {
        this.x = x;
        this.time = time;
    }

    @Override
    public int compareTo(HideOnBush h) {
        return this.time - h.time;
    }
}

public class Main {
    private static int N, K, count;
    private static int[] times = new int[100001];
    private static int time = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        if (N >= K) {
            System.out.println(N - K + "\n" + 1);
            return;
        }

        bfs();

        System.out.println(time + "\n" + count);
    }

    private static void bfs() {
        PriorityQueue<HideOnBush> pq = new PriorityQueue<>();
        pq.offer(new HideOnBush(N, 0));
        time = Integer.MAX_VALUE;
        Arrays.fill(times, Integer.MAX_VALUE);
        count = 0;

        while (!pq.isEmpty()) {
            HideOnBush faker = pq.poll();
            if (0 > faker.x || faker.x > 100000) continue;
            if (faker.time > times[faker.x]) {
                continue;
            } else {
                times[faker.x] = faker.time;
            }

            if (faker.x == K) {
                if (faker.time < time) {
                    time = faker.time;
                    count = 1;
                } else if (faker.time == time) {
                    count++;
                }
            }

            if (faker.time > time) break;

            pq.offer(new HideOnBush(faker.x + 1, faker.time + 1));
            pq.offer(new HideOnBush(faker.x - 1, faker.time + 1));
            pq.offer(new HideOnBush(faker.x * 2, faker.time + 1));
        }
    }
}
