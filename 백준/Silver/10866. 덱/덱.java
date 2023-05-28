import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        while (N-- > 0) {
            String s = br.readLine();

            if (s.startsWith("push")) {
                if (s.charAt(5) == 'f') {
                    deque.addFirst(Integer.parseInt(s.substring(11)));
                } else {
                    deque.addLast(Integer.parseInt(s.substring(10)));
                }
            }

            if (s.startsWith("pop")) {
                if (!deque.isEmpty()) {
                    if (s.charAt(4) == 'f') {
                        sb.append(deque.pollFirst()).append("\n");
                    } else {
                        sb.append(deque.pollLast()).append("\n");
                    }
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
        }
        System.out.println(sb);
    }
}
