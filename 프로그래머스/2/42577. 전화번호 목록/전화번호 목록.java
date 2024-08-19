import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Map<String, Integer> map = new HashMap<>();

        for (String prefix : phone_book) {
            map.put(prefix, 1);
        }

        for (String prefix : phone_book) {
            for (int i = 1; i < prefix.length(); i++) {
                if (map.containsKey(prefix.substring(0, i))) {
                    answer = false;
                    return answer;
                } 
            }
            
        }
        return answer;
    }
}