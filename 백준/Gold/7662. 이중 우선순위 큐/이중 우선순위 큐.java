import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            int k = Integer.parseInt(br.readLine());
            while (k-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                char c = st.nextToken().charAt(0);
                int n = Integer.parseInt(st.nextToken());

                if (c == 'D') {
                    if (treeMap.size() == 0) {
                        continue;
                    }

                    int key;
                    if (n == 1) {
                        key = treeMap.lastKey();
                    } else {
                        key = treeMap.firstKey();
                    }

                    if (treeMap.get(key) == 1) {
                        treeMap.remove(key);
                    } else {
                        treeMap.put(key, treeMap.get(key) - 1);
                    }
                }

                if (c == 'I') {
                    treeMap.put(n, treeMap.getOrDefault(n, 0) + 1);
                }
            }

            if (treeMap.size() == 0) {
                answer.append("EMPTY");
            } else {
                answer.append(treeMap.lastKey()).append(" ").append(treeMap.firstKey());
            }
            answer.append("\n");
        }
        System.out.println(answer);
    }
}
