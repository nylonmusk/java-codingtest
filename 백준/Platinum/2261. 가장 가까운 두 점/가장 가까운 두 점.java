import java.io.*;
import java.util.*;

public class Main {
    private static Point[] points, tmp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        points = new Point[n];
        tmp = new Point[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(points);
        System.out.println(solve(0, n - 1));
    }

    private static class Point implements Comparable<Point> {
        private int x, y;
        private Point(int x, int y) { this.x = x; this.y = y; }
        @Override
        public int compareTo(Point o) {
            if (this.x == o.x) return this.y - o.y;
            return this.x - o.x;
        }
    }

    private static long dist(Point a, Point b) {
        long dx = a.x - b.x;
        long dy = a.y - b.y;
        return dx * dx + dy * dy;
    }

    private static long solve(int l, int r) {
        if (r - l == 1) return dist(points[l], points[r]);
        if (r - l < 1) return Long.MAX_VALUE;

        int mid = (l + r) >> 1;
        long d = Math.min(solve(l, mid), solve(mid + 1, r));

        int t = 0;
        long midX = points[mid].x;
        for (int i = l; i <= r; i++) {
            long dx = points[i].x - midX;
            if (dx * dx < d) tmp[t++] = points[i];
        }

        Arrays.sort(tmp, 0, t, Comparator.comparingInt(a -> a.y));

        for (int i = 0; i < t; i++) {
            for (int j = i + 1; j < t; j++) {
                long dy = tmp[j].y - tmp[i].y;
                if (dy * dy >= d) break;
                d = Math.min(d, dist(tmp[i], tmp[j]));
            }
        }
        return d;
    }
}