import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double weight = Double.parseDouble(br.readLine());
        double height = Double.parseDouble(br.readLine());

        double bmi = weight / (height * height);

        if (bmi > 25.0) {
            System.out.println("Overweight");
        } else if (bmi >= 18.5 && bmi <= 25.0) {
            System.out.println("Normal weight");
        } else {
            System.out.println("Underweight");
        }
    }
}