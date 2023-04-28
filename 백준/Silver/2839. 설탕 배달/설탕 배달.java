import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sugar = Integer.parseInt(br.readLine());
		int answer = -1;

		for (int i = sugar / 5; i >= 0; i--) {
			if ((sugar - (i * 5)) % 3 == 0) {
				answer = i + ((sugar - (i * 5)) / 3);
				break;
			}
		}
        if (answer != 0) {
            bw.write(String.valueOf(answer));    
        } else{
            bw.write("-1");
        }
		bw.flush();
		bw.close();
	}
}