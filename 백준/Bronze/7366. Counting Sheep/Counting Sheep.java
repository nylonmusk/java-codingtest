import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        
        for (int i = 1; i <= n; i++) {
            int m = Integer.parseInt(br.readLine());
            String[] words = br.readLine().split(" ");
            
            int sheepCount = 0;
            for (String word : words) {
                if (word.equals("sheep")) {
                    sheepCount++;
                }
            }
            
            result.append("Case ").append(i).append(": This list contains ")
                  .append(sheepCount).append(" sheep.\n");
            
            if (i < n) {
                result.append("\n");
            }
        }
        
        System.out.print(result);
    }
}