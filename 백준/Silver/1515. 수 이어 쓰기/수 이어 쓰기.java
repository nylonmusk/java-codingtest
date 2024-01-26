import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        int answer = 1;
        int position = 0;
        while (position < s.length()) {
            for (char c : Integer.toString(answer++).toCharArray()) {
                if (c == s.charAt(position)) {
                    position++;
                }
                if (position >= s.length()) {
                    answer--;
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}