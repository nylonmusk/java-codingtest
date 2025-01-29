import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sleepTime = Integer.parseInt(br.readLine());
        int wakeTime = Integer.parseInt(br.readLine());

        System.out.println((wakeTime - sleepTime + 24) % 24);
    }
}
