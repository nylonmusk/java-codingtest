import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int totalTime = 0;

        for (int i = 0; i < input.length(); i++) {
            totalTime += timeToDial(input.charAt(i));
        }

        System.out.println(totalTime);
    }

    private static int timeToDial(char ch) {
        if (ch >= 'A' && ch <= 'C') return 3;
        else if (ch <= 'F') return 4;
        else if (ch <= 'I') return 5;
        else if (ch <= 'L') return 6;
        else if (ch <= 'O') return 7;
        else if (ch <= 'S') return 8;
        else if (ch <= 'V') return 9;
        else return 10;
    }
}
