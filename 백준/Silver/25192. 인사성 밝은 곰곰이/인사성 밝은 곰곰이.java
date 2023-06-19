import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        Set<String> set = new HashSet<>();
        while (N-- > 0) {
            String S = br.readLine();
            if (S.equals("ENTER")) {
                answer += set.size();
                set = new HashSet<>();
            } else {
                set.add(S);
            }
        }
        answer += set.size();
        System.out.println(answer);
    }
}
