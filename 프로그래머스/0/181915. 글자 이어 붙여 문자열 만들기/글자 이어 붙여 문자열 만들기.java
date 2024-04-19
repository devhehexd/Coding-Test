import java.util.*;

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer;

        char[] myChar = my_string.toCharArray();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < index_list.length; i++) {
            String changed = String.valueOf(myChar[index_list[i]]); //char을 string으로 변환
            list.add(changed);
        }
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
        }
        return answer = sb.toString();
    }
}
