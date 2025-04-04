import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        String s = null;
        int i = 1;
        while ((s = br.readLine()) != null) {
            if (s.equals("0")) break;
            answer.append("Case ").append(i++).append(": Sorting... done!").append("\n");
        }
        System.out.println(answer);
    }
}