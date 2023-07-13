import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> plusNums = new ArrayList<>();
        List<Integer> minusNums = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > 0) {
                plusNums.add(num);
            } else {
                minusNums.add(num);
            }
        }
        plusNums.sort((a, b) -> b - a);
        minusNums.sort((a, b) -> a - b);

        int sum = 0;
        int i = 0;
        while (i < plusNums.size()) {
            if (i + 1 < plusNums.size() && plusNums.get(i) != 1 && plusNums.get(i + 1) != 1) {
                sum += plusNums.get(i++) * plusNums.get(i++);
            } else {
                sum += plusNums.get(i++);
            }
        }

        i = 0;
        while (i < minusNums.size()) {
            if (i + 1 < minusNums.size()) {
                sum += minusNums.get(i++) * minusNums.get(i++);
            } else {
                sum += minusNums.get(i++);
            }
        }
        System.out.println(sum);
    }
}
