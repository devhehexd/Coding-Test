import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] charArr = my_string.toCharArray();

        for (int[] query : queries) {
            reverse(charArr, query[0], query[1]);
        }
        String answer = String.valueOf(charArr);
        return answer;
    }

    static void reverse(char[] arr, int s, int e) {

        char[] copy = Arrays.copyOfRange(arr, s, e + 1);

        for (int i = 0; i < copy.length; i++) {
            arr[s + i] = copy[copy.length - (i + 1)];
        }
    }
}