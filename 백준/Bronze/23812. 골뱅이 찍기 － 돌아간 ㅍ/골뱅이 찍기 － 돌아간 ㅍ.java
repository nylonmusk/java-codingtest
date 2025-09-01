import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        StringBuilder answer = new StringBuilder();

        for (int cellRow = 0; cellRow < 5; cellRow++) {
            for (int lineInCell = 0; lineInCell < N; lineInCell++) {
                for (int cellCol = 0; cellCol < 5; cellCol++) {
                    boolean fillFullRow = (cellRow == 1 || cellRow == 3);
                    if (fillFullRow) {
                        for (int k = 0; k < N; k++) answer.append('@');
                    } else {
                        if (cellCol == 0 || cellCol == 4) {
                            for (int k = 0; k < N; k++) answer.append('@');
                        } else {
                            for (int k = 0; k < N; k++) answer.append(' ');
                        }
                    }
                }
                answer.append('\n');
            }
        }

        System.out.print(answer);
    }
}