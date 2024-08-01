import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int k) {   
       ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {
                if (!list.contains(arr[i])) {
                    list.add(arr[i]);
                }
                if (list.size() == k) {
                    break;
                }
            }
            
            int length = list.size();

            if (length < k) {
                for (int i = 0; i < k - length; i++) {
                    list.add(-1);
                }
            }

            int[] answer = new int[list.size()];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
            }

            return answer;
    }
}