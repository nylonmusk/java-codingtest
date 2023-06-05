import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> A = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        List<Integer> B = new ArrayList<>();
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            B.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(A);
        Collections.sort(B, Collections.reverseOrder());

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A.get(i) * B.get(i);
        }
        System.out.println(sum);
    }
}
