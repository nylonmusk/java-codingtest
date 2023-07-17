import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String answer = br.readLine();
        N--;
        while (N-- > 0) {
            StringBuilder sb = new StringBuilder();
            String temp = br.readLine();
            for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) != answer.charAt(i)) {
                    sb.append("?");
                } else {
                    sb.append(answer.charAt(i));
                }
            }
            answer = sb.toString();
        }
        System.out.println(answer);
    }
}
