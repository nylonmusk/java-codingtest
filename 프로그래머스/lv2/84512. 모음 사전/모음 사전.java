import java.util.*;

class Solution {
    List<String> vowel = List.of("A", "E", "I", "O", "U");
    List<String> words = new ArrayList<>();
    public int solution(String word) {
        generateWords("");
        return words.indexOf(word) + 1;
    }
    
    void generateWords(String s) {
        if (s.length() > 0) words.add(s);
        if (s.length() == 5) return;
        for (String v : vowel) generateWords(s + v);
    }
}