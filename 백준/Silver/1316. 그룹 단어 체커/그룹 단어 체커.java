import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int k = 0; k < N; k++) {
            String temp = br.readLine();
            List<Character> list = new ArrayList<>();
            list.add(temp.charAt(0));
            for (int i = 0; i < temp.length() - 1; i++) {
                if (temp.charAt(i) != temp.charAt(i + 1)) {
                    if (list.contains(temp.charAt(i + 1))) {
                        count++;
                        break;
                    }
                    list.add(temp.charAt(i + 1));
                }
            }
        }
        System.out.println(N - count);
    }
}
