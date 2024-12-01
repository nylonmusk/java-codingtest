import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        LinkedList<Integer> line = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int pick = Integer.parseInt(st.nextToken());
            line.add(line.size() - pick, i + 1);
        }

        StringBuilder answer = new StringBuilder();
        for (int student : line) {
            answer.append(student).append(" ");
        }
        System.out.println(answer.toString().trim());
    }
}