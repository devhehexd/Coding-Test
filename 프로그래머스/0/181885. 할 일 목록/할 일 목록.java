import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> list = new ArrayList<>();
        String[] answer;
        
        int listIndex = 0;
        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                list.add(listIndex, todo_list[i]);
                listIndex++;
            }
        }

        return answer = list.toArray(new String[list.size()]);
    }
}