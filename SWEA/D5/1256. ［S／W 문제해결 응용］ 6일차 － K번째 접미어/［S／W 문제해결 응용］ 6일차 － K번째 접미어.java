import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Collections;

  
class Solution {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i <= T; i++) {
            int K = Integer.parseInt(br.readLine());
            String word = br.readLine();
            List<String> words = new ArrayList<>();
            for (int j = 0; j < word.length(); j++) {
                words.add(word.substring(j, word.length()));
            }
			Collections.sort(words); 
            answer.append("#").append(i).append(" ").append(words.get(K - 1)).append("\n");
        }
        System.out.println(answer.toString());
        br.readLine();
    }
}
    