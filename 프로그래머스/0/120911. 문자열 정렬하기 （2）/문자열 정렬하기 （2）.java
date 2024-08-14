import java.util.*;

class Solution {
    public String solution(String my_string) {
        String[] arr = new String[my_string.length()];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            arr[i] = String.valueOf(my_string.charAt(i)).toLowerCase();
        }
        Arrays.sort(arr);

        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString();
    }
}