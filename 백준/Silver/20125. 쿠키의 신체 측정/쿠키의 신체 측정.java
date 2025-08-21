import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        char[][] map = new char[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            String s = br.readLine();
            for (int j = 1; j <= N; j++) {
                map[i][j] = s.charAt(j - 1);
            }
        }

        int heartX = 0;
        int heartY = 0;

        outer:
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (map[i][j] == '*' && i + 1 <= N && map[i + 1][j] == '*') {
                    heartX = i + 1;
                    heartY = j;
                    break outer;
                }
            }
        }

        int leftArm = 0;
        for (int y = heartY - 1; y >= 1; y--) {
            if (map[heartX][y] == '*') leftArm++;
            else break;
        }

        int rightArm = 0;
        for (int y = heartY + 1; y <= N; y++) {
            if (map[heartX][y] == '*') rightArm++;
            else break;
        }

        int waist = 0;
        int waistEndX = heartX;
        for (int x = heartX + 1; x <= N; x++) {
            if (map[x][heartY] == '*') {
                waist++;
                waistEndX = x;
            } else break;
        }

        int leftLeg = 0;
        for (int x = waistEndX + 1; x <= N; x++) {
            if (map[x][heartY - 1] == '*') leftLeg++;
            else break;
        }

        int rightLeg = 0;
        for (int x = waistEndX + 1; x <= N; x++) {
            if (map[x][heartY + 1] == '*') rightLeg++;
            else break;
        }

        StringBuilder answer = new StringBuilder();

        answer.append(heartX).append(" ").append(heartY).append("\n")
                .append(leftArm).append(" ").append(rightArm).append(" ").append(waist).append(" ").append(leftLeg).append(" ").append(rightLeg);

        System.out.println(answer);
    }
}