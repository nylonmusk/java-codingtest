import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int[] pi = new int[L];
        for (int i = 1, j = 0; i < L; i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j)) j = pi[j - 1];
            if (s.charAt(i) == s.charAt(j)) pi[i] = ++j;
        }

        System.out.println(L - pi[L - 1]);
    }
}