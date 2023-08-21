import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] alphabet = new int[26];
        for (char c : s.toCharArray()) {
            alphabet[c - 'A'] += 1;
        }

        int count = 0;
        int center = -1;

        for (int i = 0; i < 26; i++) {
            if (alphabet[i] % 2 != 0) {
                center = i;
                count++;
            }
        }

        StringBuilder answer = new StringBuilder();
        if (count > 1 || (count == 0 && s.length() % 2 != 0)) {
            answer.append("I'm Sorry Hansoo");
        } else {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (alphabet[i] != 0) {
                    while (alphabet[i] > 1) {
                        temp.append((char) (i + 'A'));
                        alphabet[i] -= 2;
                    }
                }
            }
            answer.append(temp);
            if (center != -1) {
                answer.append((char) (center + 'A'));
            }
            answer.append(temp.reverse());
        }
        System.out.println(answer);
    }
}
