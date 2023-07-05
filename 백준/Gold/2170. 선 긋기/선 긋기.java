import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Line implements Comparable<Line> {
    int x;
    int y;

    Line(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int compareTo(Line line) {
        if (this.x == line.x) {
            return this.y - line.y;
        }
        return this.x - line.x;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Line> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new Line(x, y));
        }
        Collections.sort(list);
        int answer = 0;
        int x = list.get(0).x;
        int y = list.get(0).y;

        for (int i = 1; i < N; i++) {
            Line line = list.get(i);
            if (y < line.x) {
                answer += y - x;
                x = line.x;
                y = line.y;
            } else if (line.y > y) {
                y = line.y;
            }
        }
        answer += y - x;
        System.out.println(answer);
    }
}
