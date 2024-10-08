import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        Integer[] tmp = new Integer[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            tmp[i] = emergency[i];
        }

        Arrays.sort(tmp, Collections.reverseOrder());

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < tmp.length; i++) {
            map.put(tmp[i], i + 1);
        }

        for (int i = 0; i < answer.length; i++) {
            if (map.containsKey(emergency[i])) {
                answer[i] = map.get(emergency[i]);
            }
        }
        return answer;
    }
}