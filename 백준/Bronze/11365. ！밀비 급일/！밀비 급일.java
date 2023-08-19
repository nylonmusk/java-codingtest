import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        String s = "";

        while ((s = br.readLine()) != null) {
            if (s.equals("END")) break;
            String[] arr = s.split(" ");
            for (int i = arr.length - 1; i >= 0; i--) {
                StringBuilder temp = new StringBuilder();
                temp.append(arr[i]);
                answer.append(temp.reverse()).append(" ");
            }
            answer.append("\n");
        }
        System.out.println(answer);
    }
}
