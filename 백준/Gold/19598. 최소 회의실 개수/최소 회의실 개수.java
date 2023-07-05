import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Room implements Comparable<Room> {
    int start;
    int end;

    Room(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int compareTo(Room r) {
        if (this.start == r.start) {
            return this.end - r.end;
        }
        return this.start - r.start;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Room> rooms = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            rooms.add(new Room(start, end));
        }
        Collections.sort(rooms);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            if (!pq.isEmpty() && pq.peek() <= rooms.get(i).start) {
                pq.poll();
            }
            pq.offer(rooms.get(i).end);
        }
        System.out.println(pq.size());
    }
}
