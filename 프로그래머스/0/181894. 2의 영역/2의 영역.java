import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int[] answer = {};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            return new int[]{-1};
        }
        int start = list.get(0);
        int end = list.get(list.size() - 1);

        answer = new int[end - start + 1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[start + i];
        }
        return answer;
    }
}