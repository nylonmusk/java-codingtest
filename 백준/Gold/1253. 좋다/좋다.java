import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Main {
    private static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> numbers = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers.add(Integer.parseInt(st.nextToken()));
        }
        if (N <= 2) {
            System.out.println(0);
        } else {
            Collections.sort(numbers);
            for (int i = 0; i < N; i++) {
                binarySearch(numbers, numbers.get(i), i, 0, N - 1);
            }
            System.out.println(count);
        }
    }

    private static void binarySearch(List<Integer> numbers, int target, int targetIndex, int start, int end) {
        while (start < end) {
            int sum = numbers.get(start) + numbers.get(end);
            if (sum == target) {
                if (start == targetIndex) {
                    start++;
                } else if (end == targetIndex) {
                    end--;
                } else {
                    count++;
                    return;
                }
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
    }
}
