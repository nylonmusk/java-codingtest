import java.io.*;
import java.util.*;

public class Main {
    static class Task {
        int t, s;
        Task(int t, int s) {
            this.t = t;
            this.s = s;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Task[] tasks = new Task[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            tasks[i] = new Task(t, s);
        }

        Arrays.sort(tasks, (a, b) -> b.s - a.s);

        int current = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            current = Math.min(current, tasks[i].s);
            current -= tasks[i].t;
        }

        if (current < 0) {
            System.out.println(-1);
        } else {
            System.out.println(current);
        }
    }
}