import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<List<String>> letters = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            List<String> temp = new ArrayList<>();
            for (String letter : br.readLine().split("")) {
                temp.add(letter);
            }
            letters.add(temp);
        }

        StringBuilder answer = new StringBuilder();

        int i = 0;
        int j = 0;
        while (true) {
            if (letters.get(j).size() > i) {
                answer.append(letters.get(j).get(i));
            }
            if (j == 4) {
                i++;
                j = 0;
            } else {
                j++;
            }

            if (i == 15) break;
        }
        System.out.println(answer);
    }
}
