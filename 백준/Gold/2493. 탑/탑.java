import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Tower {
    int index;
    int height;

    public Tower(int index, int height) {
        this.index = index;
        this.height = height;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder answer = new StringBuilder();
        Stack<Tower> stack = new Stack<>();

        for (int i = 1; i <= N; i++) {
            int towerHeight = Integer.parseInt(st.nextToken());
            while (!stack.isEmpty()) {
                if (stack.peek().height >= towerHeight) {
                    answer.append(stack.peek().index).append(" ");
                    break;
                }
                stack.pop();
            }
            if (stack.isEmpty()) {
                answer.append("0 ");
            }
            stack.push(new Tower(i, towerHeight));
        }

        System.out.println(answer);
    }
}
