import java.util.ArrayList;

class Solution {
    public int solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<>();

            for (int i : num_list) {
                list.add(i);
            }

            return list.contains(n) ? 1 : 0;
    }
}