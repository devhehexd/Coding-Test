class Solution {
    public String[] solution(String my_str, int n) {
        StringBuilder sb = new StringBuilder(my_str);
        for (int i = n; i < sb.length(); i += n + 1) {
            sb.insert(i, "-");
        }
        String answer = sb.toString();

        return answer.split("-");
    }
}