import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int answer = s.length();
        int underBar = 0;
        for (char c : s.toCharArray()) {
            if (c == ':') answer++;
            if (c == '_') underBar++;
        }
        answer += underBar * 5;
        System.out.println(answer);
    }
}
