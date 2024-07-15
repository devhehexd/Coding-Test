import java.util.ArrayList;

class Solution {
    public String[] solution(String[] str_list) {
         ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                for (int j = 0; j < i; j++) {
                    list.add(j, str_list[j]);
                }
                break;
            } else if (str_list[i].equals("r")) {
                for (int j = 0; j < str_list.length - (i + 1); j++) {
                    list.add(j, str_list[j + (i + 1)]);
                }
                break;
            }
            }
        String[] answer = list.toArray(new String[list.size()]);

        return answer;
    }
}