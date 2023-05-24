import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String arr = br.readLine();
            StringTokenizer st = new StringTokenizer(arr.replace("[", "").replace("]", ""), ", ");
            int[] temp = new int[n];
            for (int i = 0; i < n; i++) {
                temp[i] = Integer.parseInt(st.nextToken());
            }

            boolean isError = false;
            boolean reverse = false;
            int start = 0;
            int end = n;
            for (char c : p.toCharArray()) {
                if (c == 'R') {
                    reverse = !reverse;
                }

                if (c == 'D') {
                    if (start >= end) {
                        isError = true;
                        break;
                    }
                    if (!reverse) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }

            if (isError) {
                sb.append("error").append("\n");
            } else {
                sb.append("[");
                if (!reverse) {
                    for (int i = start; i < end; i++) {
                        sb.append(temp[i]);
                        if (i != end - 1) {
                            sb.append(",");
                        }
                    }
                } else {
                    for (int i = end - 1; i >= start; i--) {
                        sb.append(temp[i]);
                        if (i != start) {
                            sb.append(",");
                        }
                    }
                }
                sb.append("]").append("\n");
            }
        }
        System.out.println(sb);
    }
}