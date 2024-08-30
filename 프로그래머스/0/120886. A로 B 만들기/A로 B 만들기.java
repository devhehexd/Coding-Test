import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        
        for (int i = 0; i < before.length(); i++) {
            map1.put(before.charAt(i), map1.getOrDefault(before.charAt(i), 0) + 1);
        }

        for (int i = 0; i < after.length(); i++) {
            map2.put(after.charAt(i), map2.getOrDefault(after.charAt(i), 0) + 1);
        }

        if (map1.equals(map2)) {
            answer = 1;
        }
        return answer;
    }
}