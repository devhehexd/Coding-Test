import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < flag.length; i++) {

                int tLength = arr[i] * 2;
                int fLength = list.size();

                if (flag[i] == true) {
                    for (int j = 0; j < tLength; j++) {
                        list.add(arr[i]);
                    }
                }
                else {
                    for (int j = fLength - 1; j >= fLength - arr[i]; j--) {
                        list.remove(j);
                    }
                }
            }
            int[] answer = new int[list.size()];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
            }
            return answer;
    }
}