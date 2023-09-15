import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) break;
            
            answer.append(num);
            if (num % n == 0) {
                answer.append(" is a multiple of ");
            } else {
                answer.append(" is NOT a multiple of ");
            }
            answer.append(n).append(".").append("\n");
        }
        
        System.out.println(answer);
    }
}