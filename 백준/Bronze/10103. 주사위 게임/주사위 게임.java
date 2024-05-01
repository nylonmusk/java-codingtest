import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static char[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int changScore = 100;
        int sangScore = 100;
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
        st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            if (c > s) sangScore -= c;
            if (s > c) changScore -= s;
        }

        System.out.println(changScore + "\n" + sangScore);
    }


}