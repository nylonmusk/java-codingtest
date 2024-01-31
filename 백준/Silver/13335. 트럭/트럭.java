import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static int n;
    private static int w;
    private static int L;
    private static int answer;
    private static final Queue<Integer> trucks = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            trucks.offer(Integer.parseInt(st.nextToken()));
        }

        getAnswer();
        System.out.println(answer);
    }

    private static void getAnswer() {
        Queue<Integer> bridge = new LinkedList<>();
        for (int i = 0; i < w; i++) {
            bridge.offer(0);
        }

        int weight = 0;

        while (!bridge.isEmpty()) {
            weight -= bridge.poll();
            if (!trucks.isEmpty()) {
                if (weight + trucks.peek() <= L) {
                    int truck = trucks.poll();
                    weight += truck;
                    bridge.offer(truck);
                } else {
                    bridge.offer(0);
                }
            }
            answer++;
        }
    }
}
