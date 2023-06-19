import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int answer = 0;

        Set<String> A = new HashSet<>();
        st = new StringTokenizer(br.readLine(), " ");
        while (N-- > 0) {
            A.add(st.nextToken());
        }

        Set<String> B = new HashSet<>();
        st = new StringTokenizer(br.readLine(), " ");
        while (M-- > 0) {
            String temp = st.nextToken();
            if (!A.contains(temp)) {
                answer++;
            }
            B.add(temp);
        }

        for (String s : A) {
            if (!B.contains(s)) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
