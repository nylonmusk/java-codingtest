import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        String s = null;
        while ((s = br.readLine()) != null) {
            for (int i = 0 ; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == 'e') {
                    answer.append('i');
                } else if (c == 'i') {
                    answer.append('e');
                } else if (c == 'E') {
                    answer.append('I');
                } else if (c == 'I') {
                    answer.append('E');
                } else {
                    answer.append(s.charAt(i));
                }
            }
            answer.append("\n");
        }
        System.out.println(answer);
    }
}
