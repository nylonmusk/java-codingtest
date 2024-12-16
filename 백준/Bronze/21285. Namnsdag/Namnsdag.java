import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String friendName = br.readLine();

        int N = Integer.parseInt(br.readLine());

        String[] nameDays = new String[N];
        for (int i = 0; i < N; i++) {
            nameDays[i] = br.readLine();
        }

        int answer = N;

        for (int i = 0; i < N; i++) {
            String currentName = nameDays[i];

            if (canTransform(friendName, currentName)) {
                answer = Math.min(answer, i + 1);
            }
        }

        System.out.println(answer);
    }

    private static boolean canTransform(String original, String target) {
        if (original.length() != target.length()) return false;

        int diffCount = 0;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) != target.charAt(i)) {
                diffCount++;
                if (diffCount > 1) return false;
            }
        }

        return diffCount == 1;
    }
}