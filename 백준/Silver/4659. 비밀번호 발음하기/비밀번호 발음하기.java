import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder answer = new StringBuilder();

        String s = null;
        while ((s = br.readLine()) != null) {
            if (s.equals("end")) {
                break;
            }

            boolean isAcceptable = true;
            if (!s.contains("a") && !s.contains("e") && !s.contains("i") && !s.contains("o") && !s.contains("u")) {
                isAcceptable = false;
            }

            if (!isAcceptable) {
                answer.append("<").append(s).append("> is not acceptable.").append("\n");
                continue;
            }

            int vowelCount = 0;
            int consonant = 0;
            char beforeChar = ' ';
            for (char c : s.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                    consonant = 0;
                } else {
                    consonant++;
                    vowelCount = 0;
                }

                if (c == beforeChar && c != 'e' && c != 'o') {
                    isAcceptable = false;
                    break;
                }
                beforeChar = c;

                if (consonant >= 3 || vowelCount >= 3) {
                    isAcceptable = false;
                    break;
                }
            }

            if (!isAcceptable) {
                answer.append("<").append(s).append("> is not acceptable.").append("\n");
            } else {
                answer.append("<").append(s).append("> is acceptable.").append("\n");
            }
        }
        System.out.println(answer);
    }
}