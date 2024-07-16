import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<>();

        int listIndex = 0;
        for (int i = 0; i < num_list.length; i += n) {
            list.add(listIndex, num_list[i]);
            listIndex++;
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}