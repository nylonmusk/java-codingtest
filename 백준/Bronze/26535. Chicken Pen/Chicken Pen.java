import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double n = Double.parseDouble(br.readLine());
        
        int size = 0;
        for (int i = 1; i <= n; i++) {
            if (Math.pow(i, 2) >= n) {
                size = i + 2;
                break;
            }
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    answer.append("x");
                } else {
                    answer.append(".");
                }
            }
            answer.append("\n");
        }

        System.out.println(answer);
    }
}