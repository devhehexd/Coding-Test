import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        Double[] average = new Double[score.length];

        for (int i = 0; i < score.length; i++) {
            average[i] = (double) ((score[i][0] + score[i][1]) / 2.0);
        }

        Double[] temp = Arrays.copyOf(average, average.length);
        Arrays.sort(temp, Collections.reverseOrder());

        Map<Double, Integer> map = new HashMap<>();
        for (int i = 0; i < temp.length; i++) {
            if (map.containsKey(temp[i])) {
                map.put(temp[i], map.get(temp[i]));
            } else {
                map.put(temp[i], i + 1);
            }
        }

        int[] answer = new int[score.length];

        for (int i = 0; i <average.length; i++) {
            answer[i] = map.get(average[i]);
        }

        return answer;
    }
}