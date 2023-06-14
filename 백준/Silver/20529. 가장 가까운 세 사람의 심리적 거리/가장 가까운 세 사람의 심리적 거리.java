import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            String[] mbti = br.readLine().split(" ");
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < N - 2; i++) {
                for (int j = i + 1; j < N - 1; j++) {
                    int count = 0;
                    for (int l = 0; l < 4; l++) {
                        if (mbti[i].charAt(l) != mbti[j].charAt(l)) {
                            count++;
                        }
                    }
                    if (count >= min) {
                        continue;
                    }
                    for (int k = j + 1; k < N; k++) {
                        int tempCount = count;
                        for (int l = 0; l < 4; l++) {
                            if (mbti[i].charAt(l) != mbti[k].charAt(l)) {
                                tempCount++;
                            }
                            if (mbti[j].charAt(l) != mbti[k].charAt(l)) {
                                tempCount++;
                            }
                        }
                        min = Math.min(min, tempCount);
                        if (min == 0) {
                            break;
                        }
                    }
                    if (min == 0) {
                        break;
                    }
                }
                if (min == 0) {
                    break;
                }
            }
            sb.append(min).append("\n");
        }
        System.out.println(sb);
    }
}
