import java.io.*;
import java.util.*;

public class Main {
    private static int rowCount, colCount;
    private static int[][] office;
    private static ArrayList<int[]> cctvList = new ArrayList<>();
    private static int minBlindSpot = Integer.MAX_VALUE;

    private static int[] deltaRow = {-1, 0, 1, 0};
    private static int[] deltaCol = {0, 1, 0, -1};

    private static int[][][] directionSets = {
            {},
            {{0}, {1}, {2}, {3}},
            {{0, 2}, {1, 3}},
            {{0, 1}, {1, 2}, {2, 3}, {3, 0}},
            {{0, 1, 2}, {1, 2, 3}, {2, 3, 0}, {3, 0, 1}},
            {{0, 1, 2, 3}}
    };

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        rowCount = Integer.parseInt(stringTokenizer.nextToken());
        colCount = Integer.parseInt(stringTokenizer.nextToken());
        office = new int[rowCount][colCount];

        for (int row = 0; row < rowCount; row++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int col = 0; col < colCount; col++) {
                office[row][col] = Integer.parseInt(stringTokenizer.nextToken());
                if (office[row][col] >= 1 && office[row][col] <= 5) {
                    cctvList.add(new int[]{row, col, office[row][col]});
                }
            }
        }

        searchCctvDirections(0, office);
        System.out.println(minBlindSpot);
    }

    private static void searchCctvDirections(int index, int[][] currentMap) {
        if (index == cctvList.size()) {
            minBlindSpot = Math.min(minBlindSpot, countBlindSpots(currentMap));
            return;
        }

        int cctvRow = cctvList.get(index)[0];
        int cctvCol = cctvList.get(index)[1];
        int cctvType = cctvList.get(index)[2];

        for (int[] directionSet : directionSets[cctvType]) {
            int[][] copiedMap = copyMap(currentMap);
            for (int direction : directionSet) {
                markWatchedArea(copiedMap, cctvRow, cctvCol, direction);
            }
            searchCctvDirections(index + 1, copiedMap);
        }
    }

    private static void markWatchedArea(int[][] map, int row, int col, int direction) {
        int nextRow = row + deltaRow[direction];
        int nextCol = col + deltaCol[direction];

        while (nextRow >= 0 && nextRow < rowCount && nextCol >= 0 && nextCol < colCount) {
            if (map[nextRow][nextCol] == 6) {
                break;
            }
            if (map[nextRow][nextCol] == 0) {
                map[nextRow][nextCol] = 7;
            }
            nextRow += deltaRow[direction];
            nextCol += deltaCol[direction];
        }
    }

    private static int countBlindSpots(int[][] map) {
        int blindCount = 0;
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < colCount; col++) {
                if (map[row][col] == 0) {
                    blindCount++;
                }
            }
        }
        return blindCount;
    }

    private static int[][] copyMap(int[][] map) {
        int[][] newMap = new int[rowCount][colCount];
        for (int row = 0; row < rowCount; row++) {
            System.arraycopy(map[row], 0, newMap[row], 0, colCount);
        }
        return newMap;
    }
}