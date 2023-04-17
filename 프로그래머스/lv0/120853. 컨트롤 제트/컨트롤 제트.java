// class Solution {
//     public int solution(String s) {
//         int answer = 0;
//         String[] str = s.split(" ");
//         for (int i = 0; i < str.length; i++) {
//             answer += !str[i].equals("Z") ? Integer.parseInt(str[i]) : - Integer.parseInt(str[i-1]);  
//         }
//         return answer;
//     }
// }

import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<String> st = new Stack<>();  
        for (String str : s.split(" ")) {
            st.push(str);
            if(st.peek().equals("Z")) {
                st.pop();
                answer -= Integer.parseInt(st.peek());
            } else {
                answer += Integer.parseInt(st.peek());
            }
        }
        return answer;
    }
}



