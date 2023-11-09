import java.util.Map;
import java.util.HashMap;

class Solution {
    private int[] leftPosition = {3, 0};
    private int[] rightPosition = {3, 2};
    private Map<Integer, int[]> keyPad = new HashMap<>();
    private String hand;
    
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        this.hand = hand;
        
        int key = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                keyPad.put(key++, new int[]{i, j});
            }
        }
        
        keyPad.put(10, new int[]{3, 0});
        keyPad.put(0, new int[]{3, 1});
        keyPad.put(12, new int[]{3, 2});
            
        for (int number : numbers) {
            answer.append(checkHand(number));
        }
        
        return answer.toString();
    }
    
    private String checkHand(int number) {
        if (number == 1 || number == 4 || number == 7) {
            leftPosition = keyPad.get(number);
            return "L";
        } else if (number == 3 || number == 6 || number == 9) {
            rightPosition = keyPad.get(number);
            return "R"; 
        } else {
            int[] targetNumber = keyPad.get(number);
            
            int leftDistance = getDistance(leftPosition, targetNumber);
            
            int rightDistance = getDistance(rightPosition, targetNumber);
            
            if (rightDistance > leftDistance) {
                leftPosition = targetNumber;
                return "L"; 
            } else if (rightDistance < leftDistance) {
                rightPosition = targetNumber;
                return "R"; 
            } else {
                if (hand.equals("left")) {
                    leftPosition = targetNumber;
                    return "L"; 
                } else {
                    rightPosition = targetNumber;
                    return "R"; 
                }
            }
        }
    }
    
    private int getDistance(int[] position, int[] targetNumber) {
        return Math.abs(position[0] - targetNumber[0]) + Math.abs(position[1] - targetNumber[1]);
    }
}