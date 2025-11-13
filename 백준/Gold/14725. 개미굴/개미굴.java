import java.io.*;
import java.util.*;

public class Main {
    private static class Node {
        Map<String, Node> children = new TreeMap<>();
    }

    private static Node root = new Node();
    private static StringBuilder answer = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            int K = Integer.parseInt(st.nextToken());
            Node cur = root;
            for (int j = 0; j < K; j++) {
                String food = st.nextToken();
                cur.children.putIfAbsent(food, new Node());
                cur = cur.children.get(food);
            }
        }

        dfsPrint(root, 0);
        System.out.print(answer.toString());
    }

    private static void dfsPrint(Node node, int depth) {
        for (Map.Entry<String, Node> e : node.children.entrySet()) {
            String name = e.getKey();
            Node child = e.getValue();

            for (int i = 0; i < depth; i++) {
                answer.append("--");
            }
            answer.append(name).append('\n');

            dfsPrint(child, depth + 1);
        }
    }
}