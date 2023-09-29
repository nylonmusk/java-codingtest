import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


class Cow implements Comparable<Cow> {
    int start;
    int end;

    public Cow(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Cow c) {
        if (this.start == c.end) {
            return this.end - c.end;
        }
        return this.start - c.start;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Cow> cows = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            cows.add(new Cow(start, end));
        }

        cows.sort(Cow::compareTo);

        int now = 0;

        for (Cow cow : cows) {
            now = Math.max(now, cow.start) + cow.end;
        }
        System.out.println(now);
    }
}
