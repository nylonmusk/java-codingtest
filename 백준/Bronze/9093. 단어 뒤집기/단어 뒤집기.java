import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        while (T-- > 0) {
            StringBuilder sb = new StringBuilder();
            String[] str = br.readLine().split(" ");
            for (String s : str) {
                for (int i = s.length() - 1; i >= 0; i--) {
                    sb.append(s.charAt(i));
                }
                sb.append(" ");
            }
            answer.append(sb).append("\n");
        }
        System.out.println(answer);
        br.close();
    }
}
