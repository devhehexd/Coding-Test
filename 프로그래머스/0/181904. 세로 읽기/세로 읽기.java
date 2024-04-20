class Solution {
    public String solution(String my_string, int m, int c) {
         char[] arr = my_string.toCharArray();

        String answer = "";
        for (int i = c - 1; i < arr.length; i += m) {
            answer += String.valueOf(arr[i]);
        }
        return answer;
    }
}