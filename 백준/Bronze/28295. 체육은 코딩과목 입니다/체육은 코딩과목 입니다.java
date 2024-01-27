import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char direction = 'N';

        for (int i = 0; i < 10; i++) {
            int instruction = Integer.parseInt(br.readLine().trim());

            direction = updateDirection(direction, instruction);
        }

        System.out.println(direction);
    }

    private static char updateDirection(char currentDirection, int instruction) {
        switch (instruction) {
            case 1:
                return rotateRight(currentDirection);
            case 2:
                return rotate180(currentDirection);
            case 3:
                return rotateLeft(currentDirection);
            default:
                return currentDirection;
        }
    }

    private static char rotateRight(char currentDirection) {
        switch (currentDirection) {
            case 'N':
                return 'E';
            case 'E':
                return 'S';
            case 'S':
                return 'W';
            case 'W':
                return 'N';
            default:
                return currentDirection;
        }
    }

    private static char rotateLeft(char currentDirection) {
        switch (currentDirection) {
            case 'N':
                return 'W';
            case 'W':
                return 'S';
            case 'S':
                return 'E';
            case 'E':
                return 'N';
            default:
                return currentDirection;
        }
    }

    private static char rotate180(char currentDirection) {
        switch (currentDirection) {
            case 'N':
                return 'S';
            case 'S':
                return 'N';
            case 'E':
                return 'W';
            case 'W':
                return 'E';
            default:
                return currentDirection;
        }
    }
}
