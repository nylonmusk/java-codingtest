import java.io.*;
import java.util.*;

public class Main {

    private static class State {
        int screen, clip, time;

        State(int screen, int clip, int time) {
            this.screen = screen;
            this.clip = clip;
            this.time = time;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(br.readLine());

        boolean[][] visited = new boolean[1001][1001];
        Queue<State> q = new ArrayDeque<>();

        q.offer(new State(1, 0, 0));
        visited[1][0] = true;

        while (!q.isEmpty()) {
            State state = q.poll();

            if (state.screen == S) {
                System.out.println(state.time);
                return;
            }

            if (!visited[state.screen][state.screen]) {
                visited[state.screen][state.screen] = true;
                q.offer(new State(state.screen, state.screen, state.time + 1));
            }

            if (state.clip > 0 && state.screen + state.clip <= 1000) {
                if (!visited[state.screen + state.clip][state.clip]) {
                    visited[state.screen + state.clip][state.clip] = true;
                    q.offer(new State(state.screen + state.clip, state.clip, state.time + 1));
                }
            }

            if (state.screen > 1) {
                if (!visited[state.screen - 1][state.clip]) {
                    visited[state.screen - 1][state.clip] = true;
                    q.offer(new State(state.screen - 1, state.clip, state.time + 1));
                }
            }
        }
    }
}