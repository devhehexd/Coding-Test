class Solution {
    public String solution(String my_string, int s, int e) {
         StringBuilder sb = new StringBuilder();

        String suffix = my_string.substring(s, e + 1);
        sb.append(suffix);
        sb.reverse();
        String prefix = my_string.substring(0, s);
        sb.insert(0, prefix);
        String rest = my_string.substring(e + 1);
        sb.append(rest);

        return sb.toString();
    }
}