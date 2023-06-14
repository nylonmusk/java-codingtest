import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder P = new StringBuilder();
        P.append("I");
        for (int i = 1; i <= N; i++) {
            P.append("OI");
        }
        int M = Integer.parseInt(br.readLine());
        String S = br.readLine();
        long count = 0;
        for (int i = 0; i <= M - P.length(); i++) {
            if (S.charAt(i) == 'I') {
                if (S.substring(i, i + P.length()).equals(P.toString())) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
