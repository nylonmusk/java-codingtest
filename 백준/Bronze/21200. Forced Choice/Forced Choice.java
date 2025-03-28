import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        Set<Integer> cards = new HashSet<>();
        for (int i = 1; i <= N; i++) {
            cards.add(i);
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < S; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            Set<Integer> chosenCards = new HashSet<>();

            for (int j = 0; j < m; j++) {
                chosenCards.add(Integer.parseInt(st.nextToken()));
            }

            if (chosenCards.contains(P)) {
                answer.append("KEEP\n");
                cards.retainAll(chosenCards);
            } else {
                answer.append("REMOVE\n");
                cards.removeAll(chosenCards);
            }
        }

        System.out.print(answer);
    }
}