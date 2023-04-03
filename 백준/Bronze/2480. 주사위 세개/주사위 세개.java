import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
      
	    int a = Integer.parseInt(st.nextToken());
      	int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
	    int prize = 0;	
	        
    	if (a == b && b == c) {
	    	prize = 10000 + (a * 1000); 
        } 
        if (a == b && b != c) {
		    prize = 1000 + (a * 100);
	    } 
        if (a != b && b == c) {
		    prize = 1000 + (b * 100);
        } 
        if (a == c && b != c) {
            prize = 1000 + (c * 100);
	    } 
        if (a != b && b != c && a != c) {
	    	prize = Math.max(Math.max(a, b), c) * 100;
	    }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Integer.toString(prize));
        bw.flush();
        bw.close();
    }
}