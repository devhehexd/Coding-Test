import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        
        for (Integer i : map.keySet()) {
            list.add(map.get(i));
        }

        Collections.sort(list, Collections.reverseOrder());
        
        int answer = 0;

        if (list.size() != 1 && list.get(0).equals(list.get(1))) {
            answer = -1;
        }
        else {
            int max = 0;
            for (Integer i : map.keySet()) {
                if (map.get(i) > max) {
                    max = map.get(i);
                    answer = i;
                }
            }
        }
        return answer;
    }
}