import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String my_string) {
      List<Character> strList = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();

        char upper = 'A';
        char lower = 'a';

        for (int i = 0; i < 26; i++) {
            strList.add(i, upper);
            strList.add(lower);
            upper += 1;
            lower += 1;
        }
        for (int i = 0; i < strList.size(); i++) {
            String str = String.valueOf(strList.get(i));
            if (my_string.contains(str)) {
                int count = my_string.length() - my_string.replace(str, "").length();
                numList.add(i, count);
            } else {
                numList.add(i, 0);
            }
        }
        int[] answer = numList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}