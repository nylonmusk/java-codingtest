import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static int[][] sudoku = new int[9][9];
    static List<int[]> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 9; i++) {
            String s = br.readLine();
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = s.charAt(j) - 48;
                if (sudoku[i][j] == 0) list.add(new int[]{i, j});
            }
        }

        backtracking(0);

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                answer.append(sudoku[i][j]);
            }
            answer.append('\n');
        }

        System.out.print(answer);
    }

    private static boolean backtracking(int count) {
        if (count == list.size()) {
            return true;
        }

        int y = list.get(count)[0];
        int x = list.get(count)[1];
        for (int i = 1; i <= 9; i++) {
            sudoku[y][x] = i;
            if (isValid(y, x) && backtracking(count + 1)) {
                return true;
            }
        }

        sudoku[y][x] = 0;
        return false;
    }

    private static boolean isValid(int i, int j) {
        for (int k = 0; k < 9; k++) {
            if (i != k && sudoku[k][j] == sudoku[i][j] || j != k && sudoku[i][k] == sudoku[i][j]) {
                return false;
            }
        }
        
        for (int ni = (i / 3) * 3, k = 0; k < 3; k++, ni++) {
            for (int nj = (j / 3) * 3, l = 0; l < 3; l++, nj++) {
                if (ni != i && nj != j && sudoku[ni][nj] == sudoku[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}