import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int ZR = Integer.parseInt(st.nextToken());
        int ZC = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < R; i++) {
            String line = br.readLine();

            StringBuilder expandedLine = new StringBuilder();
            for (int j = 0; j < C; j++) {
                for (int k = 0; k < ZC; k++) {
                    expandedLine.append(line.charAt(j));
                }
            }

            for (int k = 0; k < ZR; k++) {
                sb.append(expandedLine).append('\n');
            }
        }

        System.out.print(sb);
    }
}