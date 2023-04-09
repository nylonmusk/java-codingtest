import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i<strings.length; i++){
            arr.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for(int j = 0; j<arr.size(); j++){
            answer[j] = arr.get(j).substring(1,arr.get(j).length());
        }
        return answer;
    }
}