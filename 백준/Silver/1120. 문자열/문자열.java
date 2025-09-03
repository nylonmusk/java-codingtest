import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String A = input[0];
        String B = input[1];

        int lenA = A.length();
        int lenB = B.length();
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i <= lenB - lenA; i++) {
            int diff = 0;
            for (int j = 0; j < lenA; j++) {
                if (A.charAt(j) != B.charAt(i + j)) {
                    diff++;
                }
            }
            answer = Math.min(answer, diff);
        }

        System.out.println(answer);
    }
}