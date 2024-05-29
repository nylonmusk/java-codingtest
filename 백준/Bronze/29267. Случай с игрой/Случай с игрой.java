import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int k = Integer.parseInt(firstLine[1]);

        int answer = 0;
        int savedAmmo = 0;
        boolean hasSaved = false;
        
        for (int i = 0; i < n; i++) {
            String command = br.readLine().trim();

            switch (command) {
                case "save":
                    savedAmmo = answer;
                    hasSaved = true;
                    break;
                case "load":
                    answer = hasSaved ? savedAmmo : 0;
                    break;
                case "shoot":
                    if (answer > 0) {
                        answer--;
                    }
                    break;
                case "ammo":
                    answer += k;
                    break;
            }

            System.out.println(answer);
        }
    }
}
