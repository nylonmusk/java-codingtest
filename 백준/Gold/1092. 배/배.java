import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> cranes = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cranes.add(Integer.parseInt(st.nextToken()));
        }
        cranes.sort(Comparator.reverseOrder());

        int M = Integer.parseInt(br.readLine());
        List<Integer> boxes = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            boxes.add(Integer.parseInt(st.nextToken()));
        }
        boxes.sort(Comparator.reverseOrder());

        int answer = 0;
        if (cranes.get(0) < boxes.get(0)) {
            answer = -1;
        } else {
            while (!boxes.isEmpty()) {
                int idx = 0;
                for (int i = 0; i < cranes.size(); i++) {
                    if (idx == boxes.size()) {
                        break;
                    } else if (cranes.get(i) >= boxes.get(idx)) {
                        boxes.remove(idx);
                    } else {
                        idx++;
                        i--;
                    }
                }
                answer++;
            }
        }
        System.out.println(answer);
    }
}
