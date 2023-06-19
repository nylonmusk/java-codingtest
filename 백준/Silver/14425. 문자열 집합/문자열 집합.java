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
        
        Set<String> set = new HashSet<>();
        while (N-- > 0) {
            set.add(br.readLine());
        }
        
        while (M-- > 0) {
            if (set.contains(br.readLine())) answer++;
        }
        
        System.out.println(answer);
    }
}
