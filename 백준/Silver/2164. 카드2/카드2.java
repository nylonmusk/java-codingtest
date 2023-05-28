import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> card = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            card.push(i);
        }

        while (card.size() != 1) {
            card.pollLast();
            if (card.size() == 1) {
                break;
            }
            card.push(card.pollLast());
        }
        System.out.println(card.getFirst());
    }
}