import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strings = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<strings.length; i++){
            int arr = Integer.parseInt(strings[i]);
            min = Math.min(min, arr);
            max = Math.max(max, arr);
        }            
        
        
        answer = min + " " + max;
        return answer;
    }
}