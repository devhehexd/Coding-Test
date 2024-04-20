class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();

        String str = my_string.substring(my_string.length() - n);
        sb.append(str);
        return sb.toString();
    }
}
