//push X: 정수 X를 스택에 넣는 연산이다.
//pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 스택에 들어있는 정수의 개수를 출력한다.
//empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < N; i++) {
			String s = br.readLine();

			if (s.contains("push")) {
				stack.push(Integer.parseInt(s.replace("push ", "")));
				continue;
			}

			if (s.equals("pop")) {
				if (!stack.isEmpty()) {
					bw.write(String.valueOf(stack.peek()));
					stack.pop();
				} else {
					bw.write("-1");
				}
			}

			if (s.equals("size")) {
				bw.write(String.valueOf(stack.size()));
			}

			if (s.equals("empty")) {
				if (!stack.isEmpty()) {
					bw.write("0");
				} else {
					bw.write("1");
				}
			}

			if (s.equals("top")) {
				if (!stack.isEmpty()) {
					bw.write(String.valueOf(stack.peek()));
				} else {
					bw.write("-1");
				}
			}
			
			if (i != N - 1) {
				bw.newLine();
			}
		}
		bw.flush();
		bw.close();
	}
}
