import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < nums.length; i++) {
                map.put(i, nums[i]);
            }
            
            for (int i = 0; i < nums.length; i++) {
                if (!list.contains(map.get(i))) {
                    list.add(map.get(i));
                }
                if (list.size() >= nums.length / 2) {
                    break;
                }
            }
            return list.size();
    }
}