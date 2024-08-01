import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            HashMap<String, Integer> fileMap = new HashMap<>();

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String fileName = st.nextToken();
                int fileId = Integer.parseInt(st.nextToken());

                if (!fileMap.containsKey(fileName) || fileId < fileMap.get(fileName)) {
                    fileMap.put(fileName, fileId);
                }
            }

            List<Integer> ids = new ArrayList<>(fileMap.values());
            Collections.sort(ids);

            for (int id : ids) {
                answer.append(id).append(" ");
            }
            answer.append("\n");
        }

        System.out.print(answer);
    }
}