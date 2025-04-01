import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rankMap = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);
        }
        
        for (String calling : callings) {
            int curIdx = rankMap.get(calling);
            if (curIdx > 0) {
                String prevPlayer = players[curIdx - 1];
                
                players[curIdx - 1] = calling;
                players[curIdx] = prevPlayer;
                
                rankMap.put(calling, curIdx - 1);
                rankMap.put(prevPlayer, curIdx);
            }
        }
        
        return players;
    } 
}
