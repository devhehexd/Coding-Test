import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
       List<Integer> list = new ArrayList<>();

       while (true) {
            list.add(n); // 각 단계에서의 n을 배열에 추가합니다.
            if (n == 1) break; // n이 1이면 반복을 멈춥니다.
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (3 * n) + 1;
            }
        }

        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}