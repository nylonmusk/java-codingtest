import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] hw = br.readLine().split(" ");
        int h = Integer.parseInt(hw[0]);
        int w = Integer.parseInt(hw[1]);

        int count0 = 0;
        int count1 = 0;

        for (int i = 0; i < h; i++) {
            String line = br.readLine();
            for (int j = 0; j < w; j++) {
                if (line.charAt(j) == '0') {
                    count0++;
                } else {
                    count1++;
                }
            }
        }

        System.out.println(Math.min(count0, count1));
    }
}