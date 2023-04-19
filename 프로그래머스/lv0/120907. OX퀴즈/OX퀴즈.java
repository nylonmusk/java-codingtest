class Solution {
    public String[] solution(String[] quiz) {
        int quizLength = quiz.length;
        String[] answer = new String[quizLength];
        
        for (int i = 0; i < quizLength; i++) {
            String[] q = quiz[i].split(" ");
            
            if (q[1].equals("-")) {
                if(Integer.parseInt(q[0]) - Integer.parseInt(q[2]) == Integer.parseInt(q[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
            
            if (q[1].equals("+")) {
                if(Integer.parseInt(q[0]) + Integer.parseInt(q[2]) == Integer.parseInt(q[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }               
            }
            
        }
        return answer;
    }
}