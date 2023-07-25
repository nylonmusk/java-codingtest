import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        Set<String> set = new HashSet<>();
        for (String s : strings) {
            set.add(s);
        }
        System.out.println(set.size() == strings.length ? "yes" : "no");
    }
}
