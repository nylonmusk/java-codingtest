import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Point> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            int x = Integer.parseInt(temp.split(" ")[0]);
            int y = Integer.parseInt(temp.split(" ")[1]);
            list.add(new Point(x, y));
        }

        Collections.sort(list, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                if (p1.x == p2.x) {
                    return p1.y - p2.y;
                } else {
                    return p1.x - p2.x;
                }
            }
        });

        for (Point p : list) {
            System.out.println(p.x + " " + p.y);
        }
    }
}

class Point {
    int x,y;
    public Point (int x, int y){
        this.x = x;
        this.y = y;
    }
}