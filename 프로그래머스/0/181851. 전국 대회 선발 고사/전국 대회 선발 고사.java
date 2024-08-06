import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) {
                map.put(rank[i], i);
            }
        }

        ArrayList<Integer> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);

        return 10000 * map.get(keyList.get(0)) + 100 * map.get(keyList.get(1)) + map.get(keyList.get(2));
    }
}