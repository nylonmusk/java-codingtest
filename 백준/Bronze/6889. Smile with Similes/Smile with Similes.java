import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        String[] adj = new String[n];
        String[] noun = new String[m];

        for (int i = 0; i < n; i++) {
            adj[i] = br.readLine();
        }

        for (int i = 0; i < m; i++) {
            noun[i] = br.readLine();
        }

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                answer.append(adj[i])
                  .append(" as ")
                  .append(noun[j])
                  .append("\n");
            }
        }

        System.out.print(answer);
    }
}