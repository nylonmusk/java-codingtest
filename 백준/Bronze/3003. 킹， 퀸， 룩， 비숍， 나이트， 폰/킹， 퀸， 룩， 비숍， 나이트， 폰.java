import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int king = Integer.parseInt(st.nextToken());
        sb.append(1 - king).append(" ");
        int queen = Integer.parseInt(st.nextToken());
        sb.append(1 - queen).append(" ");
        int rook = Integer.parseInt(st.nextToken());
        sb.append(2 - rook).append(" ");
        int bishop = Integer.parseInt(st.nextToken());
        sb.append(2 - bishop).append(" ");
        int knight = Integer.parseInt(st.nextToken());
        sb.append(2 - knight).append(" ");
        int pawn = Integer.parseInt(st.nextToken());
        sb.append(8 - pawn);

        System.out.println(sb);
    }
}