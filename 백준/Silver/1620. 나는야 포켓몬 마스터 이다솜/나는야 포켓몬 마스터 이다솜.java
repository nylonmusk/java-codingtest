import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> getNum = new HashMap<>();
        Map<Integer, String> getName = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            getNum.put(temp, i + 1);
            getName.put(i + 1, temp);
        }

        while (M-- > 0) {
            String temp = br.readLine();
            for (int i = 0; i < N; i++) {
                if (!Character.isDigit(temp.charAt(0))) {
                    sb.append(getNum.get(temp)).append("\n");
                    break;
                } else {
                    sb.append(getName.get(Integer.parseInt(temp))).append("\n");
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
