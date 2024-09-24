import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new HashSet<>();

        int quotient = n;

        for (int i = 2; i <= 10000; ) {
            if (quotient == 1) {
                break;
            } else if (quotient % i == 0) {
                set.add(i);
                quotient = quotient / i;
            } else if (quotient % i != 0) {
                i++;
            }
        }
        int[] answer = set.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}