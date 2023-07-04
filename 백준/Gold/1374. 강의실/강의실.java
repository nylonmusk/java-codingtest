import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Lecture implements Comparable<Lecture> {
    int num;
    int start;
    int end;

    Lecture(int num, int start, int end) {
        this.num = num;
        this.start = start;
        this.end = end;
    }

    public int compareTo(Lecture l) {
        return this.start - l.start;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Lecture> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list.add(new Lecture(num, start, end));
        }

        Collections.sort(list);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            if (!pq.isEmpty() && pq.peek() <= list.get(i).start) {
                pq.poll();
            }
            pq.add(list.get(i).end);
        }
        System.out.println(pq.size());
        br.close();
    }
}