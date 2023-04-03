import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int threeNum1 = Integer.parseInt(bf.readLine());
		String threeNum2 = bf.readLine();

		int num1 = Integer.parseInt(threeNum2.substring(2, 3));
		int num2 = Integer.parseInt(threeNum2.substring(1, 2));
		int num3 = Integer.parseInt(threeNum2.substring(0, 1));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(Integer.toString(threeNum1 * num1));
		bw.write("\n");
		bw.write(Integer.toString(threeNum1 * num2));
		bw.write("\n");
		bw.write(Integer.toString(threeNum1 * num3));
		bw.write("\n");
		bw.write(Integer.toString(threeNum1 * Integer.parseInt(threeNum2)));
		bw.flush();
		bw.close();
	}
}