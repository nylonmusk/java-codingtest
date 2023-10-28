import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        list.add("Never gonna give you up");
        list.add("Never gonna let you down");
        list.add("Never gonna run around and desert you");
        list.add("Never gonna make you cry");
        list.add("Never gonna say goodbye");
        list.add("Never gonna tell a lie and hurt you");
        list.add("Never gonna stop");
        boolean isContain = false;
        while (N-- > 0) {
            String s = br.readLine();
            if (!list.contains(s)) {
                isContain = true;
                break;
            }
        }
        System.out.println(isContain ? "Yes" : "No");
    }
}
