import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();

        for (char c : my_string.toCharArray()) {
            if (c >= '0' && c <= '9') {
                list.add(c - '0');
            }
        }
        Collections.sort(list);
        return list.stream().mapToInt(i -> i).toArray();
    }
}