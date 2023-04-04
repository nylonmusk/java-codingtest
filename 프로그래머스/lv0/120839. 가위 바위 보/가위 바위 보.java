class Solution {
    public String solution(String rsp) {
        StringBuffer answer = new StringBuffer();
        for(int i = 0; i < rsp.length(); i++) {
            if(rsp.charAt(i) == ('2')) answer.append("0");
            if(rsp.charAt(i) == ('0')) answer.append("5");
            if(rsp.charAt(i) == ('5')) answer.append("2");
        }
        return answer.toString();
    }
}