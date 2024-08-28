import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : array) {
            map.put(i, n - i);
        }

        Integer min = 0;

        for (Integer i : map.keySet()) {
            if (min == 0) {
                min = i;
            } else if (Math.abs(map.get(i)) < Math.abs(map.get(min))) {
                min = i;
            } else if (Math.abs(map.get(i)) == Math.abs(map.get(min))) {
                if (map.get(i) > 0) {
                    min = i;
                }
            }
        }

        return min;
    }
}