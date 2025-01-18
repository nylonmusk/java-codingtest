import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String monsterMoves = br.readLine();
        StringBuilder answer = new StringBuilder();

        int length = monsterMoves.length();
        for (int i = 0; i < length; i++) {
            if (i + 2 < length &&
                    ((monsterMoves.charAt(i) == 'R' && monsterMoves.charAt(i + 1) == 'B' && monsterMoves.charAt(i + 2) == 'L') ||
                            (monsterMoves.charAt(i) == 'R' && monsterMoves.charAt(i + 1) == 'L' && monsterMoves.charAt(i + 2) == 'B') ||
                            (monsterMoves.charAt(i) == 'B' && monsterMoves.charAt(i + 1) == 'R' && monsterMoves.charAt(i + 2) == 'L') ||
                            (monsterMoves.charAt(i) == 'B' && monsterMoves.charAt(i + 1) == 'L' && monsterMoves.charAt(i + 2) == 'R') ||
                            (monsterMoves.charAt(i) == 'L' && monsterMoves.charAt(i + 1) == 'R' && monsterMoves.charAt(i + 2) == 'B') ||
                            (monsterMoves.charAt(i) == 'L' && monsterMoves.charAt(i + 1) == 'B' && monsterMoves.charAt(i + 2) == 'R'))) {
                answer.append('C');
                i += 2;
            } else {
                char move = monsterMoves.charAt(i);
                if (move == 'R') {
                    answer.append('S');
                } else if (move == 'B') {
                    answer.append('K');
                } else if (move == 'L') {
                    answer.append('H');
                }
            }
        }

        System.out.println(answer);
    }
}