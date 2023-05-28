import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            String s = br.readLine();

            if (s.length() >= 4 && s.substring(0, 4).equals("push")) {
                deque.add(Integer.parseInt(s.substring(5)));
            }

            if (s.equals("front")) {
                if (!deque.isEmpty()) {
                    sb.append(deque.getFirst()).append("\n");
                } else {
                    sb.append("-1").append("\n");
                }
            }

            if (s.equals("back")) {
                if (!deque.isEmpty()) {
                    sb.append(deque.getLast()).append("\n");
                } else {
                    sb.append("-1").append("\n");
                }
            }

            if (s.equals("size")) {
                sb.append(deque.size()).append("\n");
            }

            if (s.equals("empty")) {
                if (!deque.isEmpty()) {
                    sb.append("0").append("\n");
                } else {
                    sb.append("1").append("\n");
                }
            }

            if (s.equals("pop")) {
                if (!deque.isEmpty()) {
                    sb.append(deque.poll()).append("\n");
                } else {
                    sb.append("-1").append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}