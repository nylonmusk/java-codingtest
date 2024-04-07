import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList<>();
        int[] arr = new int[n + 1];
        int[] indexArr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        list.add(Integer.MIN_VALUE);

        for (int i = 1; i <= n; i++) {
            int num = arr[i];
            int left = 1;
            int right = list.size() - 1;

            if (num > list.get(list.size() - 1)) {
                list.add(num);
                indexArr[i] = list.size() - 1;
            } else {
                while (left < right) {
                    int mid = (left + right) >> 1;

                    if (list.get(mid) >= num) {
                        right = mid;
                    } else {
                        left = mid + 1;
                    }
                }
                list.set(right, num);
                indexArr[i] = right;
            }
        }

        answer.append(list.size() - 1).append("\n");
        Stack<Integer> stack = new Stack<>();

        int index = list.size() - 1;

        for (int i = n; i > 0; i--) {
            if (indexArr[i] == index) {
                index--;
                stack.push(arr[i]);
            }
        }

        while (!stack.isEmpty()) {
            answer.append(stack.pop()).append(" ");
        }

        System.out.println(answer);
    }
}