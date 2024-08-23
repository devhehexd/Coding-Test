import java.util.*;

class Solution {
    public String solution(String s) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int sameLetterCount = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    sameLetterCount++;
                }
            }
            if (sameLetterCount == 1) {
                list.add(String.valueOf(s.charAt(i)));
            }
        }
        Collections.sort(list);

        for (String str : list) {
            sb.append(str);
        }
        return sb.toString();
    }
}