import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        LinkedList<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        st = new StringTokenizer(br.readLine());
        int count = 0;

        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            int index = deque.indexOf(target);

            int halfIndex;
            if (deque.size() % 2 == 0) {
                halfIndex = deque.size() / 2 - 1;
            } else {
                halfIndex = deque.size() / 2;
            }

            if (index <= halfIndex) {
                for (int j = 0; j < index; j++) {
                    deque.addLast(deque.pollFirst());
                    count++;
                }
            }
            else {
                for (int j = 0; j < deque.size() - index; j++) {
                    deque.addFirst(deque.pollLast());
                    count++;
                }
            }

            deque.pollFirst();
        }

        System.out.println(count);
    }
}