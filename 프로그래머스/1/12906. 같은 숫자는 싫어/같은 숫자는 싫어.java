import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        String start = String.valueOf(arr[0]);

        StringBuilder sb = new StringBuilder(start);
        ArrayList<Integer> list = new ArrayList<>();



        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                sb.append(" ");
            } else if (arr[i] != arr[i - 1]) {
                sb.append(arr[i]);
            }
        }
        String tmp = sb.toString();
        tmp = tmp.replace(" ", "");

        for (int i = 0; i < tmp.length(); i++) {
            int num = tmp.charAt(i) - '0';
            list.add(num);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}