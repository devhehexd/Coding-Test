import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] arr = new int[numbers.length * 3];

        int numbersIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (numbersIdx == numbers.length) {
                numbersIdx = 0;
            }
            arr[i] = numbers[numbersIdx];
            numbersIdx++;
        }

        int[] answer = new int[numbers.length];

        if (direction.equals("right")) {
            answer = Arrays.copyOfRange(arr, arr.length - numbers.length - 1, arr.length - 1);
        }
        else {
            answer = Arrays.copyOfRange(arr, 1, numbers.length + 1);
        }
        return answer;
    }
}