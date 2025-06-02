import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder ingredients = new StringBuilder(br.readLine());

        ingredients.reverse();

        int sCount = 0;
        int tCount = 0;
        int idx = 0;

        for (int i = 0; i < N; i++) {
            char ch = ingredients.charAt(i);
            if (ch == 's') sCount++;
            else if (ch == 't') tCount++;

            if (sCount == tCount) {
                idx = i + 1;
            }
        }

        StringBuilder answer = new StringBuilder(ingredients.substring(0, idx));
        answer.reverse();

        System.out.println(answer);
    }
}