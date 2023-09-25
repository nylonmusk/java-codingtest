import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;

        List<Integer> science = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            science.add(Integer.parseInt(br.readLine()));
        }
        science.sort((a, b) -> b - a);

        for (int i = 0; i < 3; i++ ) {
            answer += science.get(i);
        }
        answer += Math.max(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()));

        System.out.println(answer);
    }
}