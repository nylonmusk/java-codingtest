import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sugar = Integer.parseInt(br.readLine());
		int answer = -1;

		for (int i = sugar / 5; i >= 0; i--) {
			if ((sugar - (i * 5)) % 3 == 0) {
				answer = i + ((sugar - (i * 5)) / 3);
				break;
			}
		}
        System.out.println(answer != 0 ? answer : -1);
	}
}