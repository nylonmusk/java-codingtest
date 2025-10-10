import java.io.*;
import java.util.*;

public class Main {

    private static int rowCount;
    private static int colCount;
    private static int currentRow;
    private static int currentCol;
    private static int commandCount;
    private static int[][] map;
    private static int[] dice = new int[6];

    private static int[] deltaRow = {0, 0, -1, 1};
    private static int[] deltaCol = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        rowCount = Integer.parseInt(stringTokenizer.nextToken());
        colCount = Integer.parseInt(stringTokenizer.nextToken());
        currentRow = Integer.parseInt(stringTokenizer.nextToken());
        currentCol = Integer.parseInt(stringTokenizer.nextToken());
        commandCount = Integer.parseInt(stringTokenizer.nextToken());

        map = new int[rowCount][colCount];
        for (int row = 0; row < rowCount; row++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int col = 0; col < colCount; col++) {
                map[row][col] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder outputBuilder = new StringBuilder();

        for (int i = 0; i < commandCount; i++) {
            int direction = Integer.parseInt(stringTokenizer.nextToken()) - 1;

            int nextRow = currentRow + deltaRow[direction];
            int nextCol = currentCol + deltaCol[direction];

            if (nextRow < 0 || nextRow >= rowCount || nextCol < 0 || nextCol >= colCount) {
                continue;
            }

            rollDice(direction);
            currentRow = nextRow;
            currentCol = nextCol;

            if (map[currentRow][currentCol] == 0) {
                map[currentRow][currentCol] = dice[5];
            } else {
                dice[5] = map[currentRow][currentCol];
                map[currentRow][currentCol] = 0;
            }

            outputBuilder.append(dice[0]).append("\n");
        }

        System.out.print(outputBuilder);
    }

    private static void rollDice(int direction) {
        int top = dice[0];
        int bottom = dice[5];
        int north = dice[1];
        int south = dice[4];
        int east = dice[3];
        int west = dice[2];

        if (direction == 0) {
            dice[0] = west;
            dice[2] = bottom;
            dice[5] = east;
            dice[3] = top;
        } else if (direction == 1) {
            dice[0] = east;
            dice[3] = bottom;
            dice[5] = west;
            dice[2] = top;
        } else if (direction == 2) {
            dice[0] = south;
            dice[1] = top;
            dice[5] = north;
            dice[4] = bottom;
        } else if (direction == 3) {
            dice[0] = north;
            dice[4] = top;
            dice[5] = south;
            dice[1] = bottom;
        }
    }
}