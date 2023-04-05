class Solution {
    boolean solution(String s) {
        
        s = s.toUpperCase();
        return s.chars().filter(ch -> 'P'== ch).count() == s.chars().filter(ch -> 'Y'== ch).count();
    }
}