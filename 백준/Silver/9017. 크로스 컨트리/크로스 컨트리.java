import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Score {
    int score;
    int count;
    int fifthScore;

    Score(int score, int count, int fifthScore) {
        this.score = score;
        this.count = count;
        this.fifthScore = fifthScore;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());

            List<Integer> teams = new ArrayList<>();
            Map<Integer, Integer> competitors = new HashMap<>();
            Map<Integer, Score> scores = new HashMap<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int team = Integer.parseInt(st.nextToken());
                teams.add(team);
                competitors.put(team, competitors.getOrDefault(team, 0) + 1);

                if (!scores.containsKey(team)) scores.put(team, new Score(0, 0, 0));
            }

            int i = 1;

            for (int team : teams) {
                if (competitors.get(team) == 6 && scores.get(team).count < 4) {
                    scores.put(team, new Score(scores.get(team).score + i, scores.get(team).count + 1, 0));
                    i++;
                } else if (scores.get(team).count >= 4) {
                    if (scores.get(team).fifthScore == 0) {
                        scores.put(team, new Score(scores.get(team).score, scores.get(team).count, i));
                    }
                    i++;
                }

            }

            List<Integer> keys = new ArrayList<>();

            for (int key : scores.keySet()) {
                if (competitors.get(key) == 6) {
                    keys.add(key);
                }
            }

            keys.sort((a, b) -> {
                if (scores.get(a).score == scores.get(b).score) {
                    return scores.get(a).fifthScore - scores.get(b).fifthScore;
                }
                return scores.get(a).score - scores.get(b).score;
            });

            answer.append(keys.get(0)).append("\n");
        }
        System.out.println(answer);
    }
}