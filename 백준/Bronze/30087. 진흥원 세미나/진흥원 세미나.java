import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        while (N-- > 0) {
            String s = br.readLine();
            if (s.equals("Algorithm")) answer.append(204);
            if (s.equals("DataAnalysis")) answer.append(207);
            if (s.equals("ArtificialIntelligence")) answer.append(302);
            if (s.equals("CyberSecurity")) answer.append("B101");
            if (s.equals("Network")) answer.append(303);
            if (s.equals("Startup")) answer.append(501);
            if (s.equals("TestStrategy")) answer.append(105);

            answer.append("\n");
        }
        System.out.println(answer);
    }
}
