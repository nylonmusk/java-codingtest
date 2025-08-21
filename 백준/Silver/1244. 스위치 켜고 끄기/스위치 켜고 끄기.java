import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Student {
    int sex;
    int switchNumber;

    public Student(int sex, int switchNumber) {
        this.sex = sex;
        this.switchNumber = switchNumber;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> switches = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            switches.add(Integer.parseInt(st.nextToken()));
        }

        int numberOfStudents = Integer.parseInt(br.readLine());

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < numberOfStudents; i++) {
            st = new StringTokenizer(br.readLine());
            students.add(new Student(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).sex == 1) {
                int number = students.get(i).switchNumber;
                for (int j = number; j <= N; j += number) {
                    changeSwitch(switches, j - 1);
                }
            } else {
                int number = students.get(i).switchNumber - 1;
                changeSwitch(switches, number);

                int x = 1;
                while (number - x >= 0 && number + x < N) {
                    if (switches.get(number - x) == switches.get(number + x)) {
                        changeSwitch(switches, number - x);
                        changeSwitch(switches, number + x);
                        x++;
                    } else {
                        break;
                    }
                }
            }
        }

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < switches.size(); i++) {
            answer.append(switches.get(i)).append(" ");
            if ((i + 1) % 20 == 0) {
                answer.append("\n");
            }
        }

        System.out.println(answer.toString().trim());
    }

    private static void changeSwitch(List<Integer> switches, int number) {
        int changedSwitch = changeSwitch(switches.get(number));
        switches.remove(number);
        switches.add(number, changedSwitch);
    }

    private static int changeSwitch(int status) {
        return status == 1 ? 0 : 1;
    }
}