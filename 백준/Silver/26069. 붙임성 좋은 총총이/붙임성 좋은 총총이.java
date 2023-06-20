import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> dance = new HashSet<>();
        dance.add("ChongChong");
        while (N-- > 0) {
            String record = br.readLine();
            String A = record.split(" ")[0];
            String B = record.split(" ")[1];

            if (dance.contains(A)) {
                dance.add(B);
            } else if (dance.contains(B)) {
                dance.add(A);
            }
        }
        System.out.println(dance.size());
    }
}
