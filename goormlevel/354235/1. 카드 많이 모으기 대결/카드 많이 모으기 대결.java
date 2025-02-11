import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int Goorm = Integer.parseInt(st.nextToken());
		int Baram = Integer.parseInt(st.nextToken());
		
		if (Goorm > Baram) {
			System.out.println("Goorm");
		} else if (Goorm < Baram) {
			System.out.println("Baram");
		} else {
			System.out.println("Tie");	
		}
	}
}