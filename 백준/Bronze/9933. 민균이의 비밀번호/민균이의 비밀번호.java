import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        Set<String> pw = new HashSet<>();
        List<String> reversedPw = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            pw.add(temp);
            StringBuilder temp1 = new StringBuilder();
            for (int j = temp.length() - 1; j >= 0; j--) {
                temp1.append(temp.charAt(j));
            }
            reversedPw.add(temp1.toString());
        }

        for (int i = 0; i < N; i++) {
            if (pw.contains(reversedPw.get(i))) {
                answer.append(reversedPw.get(i).length()).append(" ").append(reversedPw.get(i).charAt(reversedPw.get(i).length() / 2));
                break;
            }
        }
        System.out.println(answer);
    }
}
