import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sumScore = Integer.parseInt(st.nextToken());
        int diffScore = Integer.parseInt(st.nextToken());

        int team1Score = (sumScore + diffScore) / 2;
        int team2Score = (sumScore - diffScore) / 2;

        if (team1Score >= 0 && team2Score >= 0 && (team1Score + team2Score) == sumScore && Math.abs(team1Score - team2Score) == diffScore) {
            System.out.println(team1Score + " " + team2Score);
        } else {
            System.out.println("-1");
        }
    }
}
