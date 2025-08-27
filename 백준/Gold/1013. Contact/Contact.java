import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        int T = Integer.parseInt(br.readLine().trim());

        Pattern p = Pattern.compile("^(100+1+|01)+$");

        for (int tc = 0; tc < T; tc++) {
            String s = br.readLine().trim();
            Matcher m = p.matcher(s);
            if (m.matches())  {
                answer.append("YES\n");
            } else {
                answer.append("NO\n");
            }
        }

        System.out.print(answer);
    }
}