import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        StringBuilder sb = new StringBuilder();
        while ((str = br.readLine()) != null) {
            sb.append(str);
        }

        int answer = 0;
        for (String s : sb.toString().split(",")) {
            answer += Integer.parseInt(s);
        }
        System.out.println(answer);
    }
}
