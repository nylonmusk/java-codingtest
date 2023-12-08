import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Bus implements Comparable<Bus> {
    int S;
    int E;
    int C;

    Bus(int S, int E, int C) {
        this.S = S;
        this.E = E;
        this.C = C;
    }

    @Override
    public int compareTo(Bus b) {
        if (this.S != b.S) {
            return this.S - b.S;
        }
        return this.E - b.E;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Bus> buses = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            buses.add(new Bus(S, E, C));
        }

        Collections.sort(buses);

        List<Bus> mergedBuses = new ArrayList<>();
        Bus current = buses.get(0);

        for (int i = 1; i < buses.size(); i++) {
            Bus next = buses.get(i);
            if (current.E >= next.S) {
                current.E = Math.max(current.E, next.E);
                current.C = Math.min(current.C, next.C);
            } else {
                mergedBuses.add(current);
                current = next;
            }
        }
        mergedBuses.add(current);

        StringBuilder answer = new StringBuilder();
        answer.append(mergedBuses.size()).append("\n");
        for (Bus bus : mergedBuses) {
            answer.append(bus.S).append(" ").append(bus.E).append(" ").append(bus.C).append("\n");
        }

        System.out.println(answer);
    }
}
