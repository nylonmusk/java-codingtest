import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            String leader = "";
            int maxUniqueLetters = 0;

            for (int i = 0; i < N; i++) {
                String name = br.readLine();
                Set<Character> uniqueLetters = new HashSet<>();

                for (char c : name.toCharArray()) {
                    if (c != ' ') {
                        uniqueLetters.add(c);
                    }
                }

                int uniqueCount = uniqueLetters.size();

                if (uniqueCount > maxUniqueLetters || (uniqueCount == maxUniqueLetters && name.compareTo(leader) < 0)) {
                    maxUniqueLetters = uniqueCount;
                    leader = name;
                }
            }

            System.out.println("Case #" + t + ": " + leader);
        }
    }
}