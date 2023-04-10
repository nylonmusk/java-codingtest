import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr1 = new int[N][M];
        int[][] arr2 = new int[N][M];
        
        for (int i = 0; i < arr1.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        for (int i = 0; i < arr2.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr2[0].length; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                bw.write(Integer.toString(arr1[i][j] + arr2[i][j]));
                if (j != arr2[0].length - 1) {
                    bw.write(" ");
                }
            }
            if (i != arr1.length - 1) {
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}