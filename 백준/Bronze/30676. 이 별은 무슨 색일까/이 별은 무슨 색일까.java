import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();

        if (620 <= r && r <= 780) {
            answer.append("Red");
        } else if (590 <= r && r <= 620) {
            answer.append("Orange");
        } else if (570 <= r && r <= 590) {
            answer.append("Yellow");
        } else if (495 <= r && r <= 570) {
            answer.append("Green");
        } else if (450 <= r && r <= 495) {
            answer.append("Blue");
        } else if (425 <= r && r <= 450) {
            answer.append("Indigo");
        } else if (380 <= r && r <= 425) {
            answer.append("Violet");
        }
        System.out.println(answer);
    }
}