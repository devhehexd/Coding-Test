import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int rowIndex = 0;
        int[] answer = new int[commands.length];

        while (rowIndex < commands.length) {

            int splitStart = commands[rowIndex][0] - 1;
            int splitEnd = commands[rowIndex][1] - 1;
            int answerIndex = commands[rowIndex][2];

            int[] arr = new int[splitEnd - splitStart + 1];

            int idx = 0;
            for (int i = splitStart; i <= splitEnd; i++) {
                arr[idx++] = array[i];
            }

            Arrays.sort(arr);
            answer[rowIndex] = arr[answerIndex - 1];

            rowIndex++;
        }
        return answer;
    }
}