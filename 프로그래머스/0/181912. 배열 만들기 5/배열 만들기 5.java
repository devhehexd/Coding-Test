import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
      List<Integer> list = new ArrayList<>();


        for (int i = 0; i < intStrs.length; i++) {
            char[] temp = intStrs[i].toCharArray();
            char[] intChars = new char[l];
            for (int j = 0; j < l; j++) {
                intChars[j] = temp[j + s];
            }
            int num = Integer.parseInt(String.valueOf(intChars));
            if (num > k) {
                list.add(num);
            }
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}