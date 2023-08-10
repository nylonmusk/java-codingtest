import java.util.*;

class Solution {
    public List<String> solution(String[] record) {
        List<String> answer = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        for (String str : record) {
            if (!str.split(" ")[0].equals("Leave")) {
                String id = str.split(" ")[1];
                String nickname = str.split(" ")[2];
                map.put(id, nickname);
            }
        }
        
        
        for (int i = 0; i < record.length; i++) {
            String command = record[i].split(" ")[0];
            String id = record[i].split(" ")[1];
            if (command.equals("Enter")) {
                answer.add(map.get(id) + "님이 들어왔습니다.");
            } else if (command.equals("Leave")) {
                answer.add(map.get(id) + "님이 나갔습니다.");
            }   
        }
        return answer;
    }
}