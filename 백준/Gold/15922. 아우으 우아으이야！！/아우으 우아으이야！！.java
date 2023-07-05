import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Point implements Comparable<Point> {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int compareTo(Point p) {
        if (this.x == p.x) {
            return this.y - p.y;
        }
        return this.x - p.x;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Point> lines = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            lines.add(new Point(x, y));
        }
        Collections.sort(lines);

        int answer = 0;
        int x = lines.get(0).x;
        int y = lines.get(0).y;
        for (int i = 1; i < N; i++) {
            if (y < lines.get(i).x) {
                answer += y - x;
                x = lines.get(i).x;
                y = lines.get(i).y;
            } else if (lines.get(i).y > y) {
                y = lines.get(i).y;
            }
        }
        answer += y - x;
        System.out.println(answer);
    }
}
