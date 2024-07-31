import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

            for (int num : arr) {
                for (int i = 0; i < num; i++) {
                    list.add(num);
                }
            }

            int[] answer = new int[list.size()];

            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
            return answer;
    }
}