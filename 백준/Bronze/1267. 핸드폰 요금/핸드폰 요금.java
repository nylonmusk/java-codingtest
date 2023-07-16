import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> costs = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            costs.add(Integer.parseInt(st.nextToken()));
        }

        int M = 0;
        int Y = 0;

        for (int cost : costs) {
            Y += (cost / 30 + 1) * 10;
            M += (cost / 60 + 1) * 15;
        }

        if (M < Y) {
            System.out.println("M " + M);
        } else if (M > Y) {
            System.out.println("Y " + Y);
        } else {
            System.out.println("Y M " + Y);
        }
    }
}

