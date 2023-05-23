import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        for (String s : br.readLine().split("")) {
            list.add(s);
        }

        Collections.sort(list, Collections.reverseOrder());
        for (String s : list) {
            sb.append(s);
        }
        System.out.println(sb);
    }
}