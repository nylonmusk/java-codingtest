import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        for (String s : my_string.split(" ")) {
            s = s.replaceAll(" ", "");
            if (!s.equals("")) {
                list.add(s);
            }
        }
        return list.toArray(new String[0]);
    }
}