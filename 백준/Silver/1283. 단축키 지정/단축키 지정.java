import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int n = Integer.parseInt(br.readLine().trim());
        boolean[] used = new boolean[26];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();

            int markPos = -1;

            List<Integer> firsts = new ArrayList<>();
            if (!line.isEmpty() && isAlpha(line.charAt(0))) firsts.add(0);
            for (int p = 1; p < line.length(); p++) {
                if (line.charAt(p - 1) == ' ' && isAlpha(line.charAt(p))) {
                    firsts.add(p);
                }
            }

            for (int pos : firsts) {
                char ch = Character.toUpperCase(line.charAt(pos));
                int idx = ch - 'A';
                if (idx >= 0 && idx < 26 && !used[idx]) {
                    used[idx] = true;
                    markPos = pos;
                    break;
                }
            }

            if (markPos == -1) {
                for (int p = 0; p < line.length(); p++) {
                    char c = line.charAt(p);
                    if (!isAlpha(c)) continue;
                    char ch = Character.toUpperCase(c);
                    int idx = ch - 'A';
                    if (idx >= 0 && idx < 26 && !used[idx]) {
                        used[idx] = true;
                        markPos = p;
                        break;
                    }
                }
            }

            if (markPos == -1) {
                answer.append(line).append('\n');
            } else {
                answer.append(line, 0, markPos)
                        .append('[').append(line.charAt(markPos)).append(']')
                        .append(line.substring(markPos + 1))
                        .append('\n');
            }
        }

        System.out.print(answer);
    }

    private static boolean isAlpha(char c) {
        return ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z');
    }
}