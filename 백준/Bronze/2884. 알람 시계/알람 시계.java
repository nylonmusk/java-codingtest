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

	    int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        
	    if (min - 45 >= 0) {
		    min -= 45;		
    	} else if (min - 45 < 0) {
	    	if (hour == 0) {
	    		hour = 23;
		    	min = 60 - (45 - min); 
	    	} else {
		    	hour -= 1;
	    		min = 60 - (45 - min); 
		    }
	    }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Integer.toString(hour));
        bw.write(" ");
        bw.write(Integer.toString(min));
        bw.flush();
        bw.close();
    }
}