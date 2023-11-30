import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int K;
    static String[] words;
    static boolean[] alphabet = new boolean[26];
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        words = new String[N];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            words[i] = s.substring(4, s.length() - 4);
        }

        K = K - 5;
        alphabet['a' - 97] = alphabet['c' - 97] = alphabet['i' - 97] = alphabet['n' - 97] = alphabet['t' - 97] = true;

        if (K < 0) {
            System.out.println(0);
            return;
        }

        permutation(0, 0);
        System.out.println(answer);
    }

    public static void permutation(int count, int idx) {
        if (K == count) {
            answer = Math.max(answer, getAnswer());
            return;
        }

        for (int i = idx; i < 26; i++) {
            if (alphabet[i]) {
                continue;
            }

            alphabet[i] = true;
            permutation(count + 1, i + 1);
            alphabet[i] = false;
        }
    }

    public static int getAnswer() {
        int answer = 0;
        boolean check;
        for (String a : words) {
            check = true;
            for (int i = 0; i < a.length(); i++) {
                check = alphabet[a.charAt(i) - 97];
                if (!check) {
                    break;
                }
            }
            if (check) {
                answer++;
            }
        }
        return answer;
    }
}