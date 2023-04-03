class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        int i = 0;
        for(int j = num1; j <= num2; j++) {
            answer[i] = numbers[j];
            i++;
        }
        return answer;
    }
}