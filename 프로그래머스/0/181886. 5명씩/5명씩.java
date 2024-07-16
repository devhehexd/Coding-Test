import java.util.ArrayList;

class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> list = new ArrayList<>();
        String[] answer;

        int listIndex = 0;
        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0) {
                list.add(listIndex, names[i]);
                listIndex++;
            }
        }
        return answer = list.toArray(new String[list.size()]);
    }
}