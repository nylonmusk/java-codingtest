class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] user = new int[2];
        user[0] = 0;
        user[1] = 0;
        int max_x = (board[0] - 1) / 2;
        int max_y = (board[1] - 1) / 2;
        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("left") && user[0] > -max_x)     user[0] = user[0] - 1;
            if (keyinput[i].equals("right") && user[0] < max_x)    user[0] = user[0] + 1;
            if (keyinput[i].equals("up") && user[1] < max_y)       user[1] = user[1] + 1;
            if (keyinput[i].equals("down") && user[1] > -max_y)    user[1] = user[1] - 1;
        }
        return user;
    }
}
