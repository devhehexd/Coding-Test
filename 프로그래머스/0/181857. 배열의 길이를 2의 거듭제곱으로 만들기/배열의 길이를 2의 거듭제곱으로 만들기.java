import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

            for (int i : arr) {
                list.add(i);
            }

            int[] answer;

            int exponent = 0;

            while (true) {

                int twoSquareLength = (int) Math.pow(2, exponent);

                if (list.size() == twoSquareLength) {
                    answer = Arrays.copyOf(arr, arr.length);
                    break;
                } else if (list.size() < twoSquareLength) {
                    for (int i = 0; i < twoSquareLength - arr.length; i++) {
                        list.add(0);
                    }
                    answer = new int[list.size()];

                    for (int i = 0; i < answer.length; i++) {
                        answer[i] = list.get(i);
                    }
                    break;
                } else {
                    exponent++;
                }
            }

            return answer;
    }
}