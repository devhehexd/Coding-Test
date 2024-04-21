class Solution {
    public String solution(String my_string, int[] indices) {
       StringBuilder sb = new StringBuilder(my_string);

        for (int i = 0; i < indices.length; i++) {
            sb.setCharAt(indices[i],' ');
        }
        String temp = sb.toString();
        String answer = temp.replace(" ", "");

        return answer;
    }
}