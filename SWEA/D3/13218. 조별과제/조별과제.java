import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder answer = new StringBuilder();
		for (int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine());
            answer.append("#").append(i).append(" ").append(N / 3).append("\n");
		}
		System.out.println(answer.toString());
        br.close();
	}
}