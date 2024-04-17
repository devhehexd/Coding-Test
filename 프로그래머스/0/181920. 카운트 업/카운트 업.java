import java.util.ArrayList;

class Solution {
    public int[] solution(int start_num, int end_num) {
        ArrayList<Integer> list = new ArrayList<>();
        int listRange = (end_num - start_num) + 1;

        int num = start_num;
        for (int i = 0; i < listRange; i++) {
            list.add(start_num + i);
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}