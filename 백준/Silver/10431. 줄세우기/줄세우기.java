import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int P = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        while (P-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());
            int[] heights = new int[20];
            for (int i = 0; i < 20; i++) {
                heights[i] = Integer.parseInt(st.nextToken());
            }

            List<Integer> line = new ArrayList<>();
            int moves = 0;

            for (int i = 0; i < 20; i++) {
                int current = heights[i];
                int pos = line.size();

                for (int j = 0; j < line.size(); j++) {
                    if (line.get(j) > current) {
                        pos = j;
                        break;
                    }
                }

                moves += line.size() - pos;
                line.add(pos, current);
            }

            answer.append(T).append(" ").append(moves).append("\n");
        }

        System.out.println(answer);
    }
}