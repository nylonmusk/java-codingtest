import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String yeondoo = br.readLine();
        int n = Integer.parseInt(br.readLine());
        String[] teams = new String[n];

        for (int i = 0; i < n; i++) {
            teams[i] = br.readLine();
        }

        String bestTeam = "";
        int maxScore = -1;

        Arrays.sort(teams);

        for (String team : teams) {
            int score = calculate(yeondoo, team);
            if (score > maxScore) {
                maxScore = score;
                bestTeam = team;
            }
        }

        System.out.println(bestTeam);
    }

    static int calculate(String yeondoo, String team) {
        int L = 0, O = 0, V = 0, E = 0;
        String combined = yeondoo + team;

        for (char ch : combined.toCharArray()) {
            if (ch == 'L') L++;
            else if (ch == 'O') O++;
            else if (ch == 'V') V++;
            else if (ch == 'E') E++;
        }

        return ((L + O) * (L + V) * (L + E) * (O + V) * (O + E) * (V + E)) % 100;
    }
}