import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(String[] s1, String[] s2) {
        Set<String> set = new HashSet<>();
        for(String s : s1) set.add(s);
        for(String s : s2) set.add(s);
        return s1.length + s2.length - set.size();
    }
}