import java.util.*;

class Solution {
    public String solution(int age) {
        Map<String, Character> map = new HashMap<>();

        for (int i = 0; i < 26; i++) {
            String num = String.valueOf(i);
            map.put(num, (char) ('a' + i));
        }

        String strAge = String.valueOf(age);

        String answer = "";
        
        for (int i = 0; i < strAge.length(); i++) {
            answer += map.get(String.valueOf(strAge.charAt(i)));
        }

        return answer;
    }
}