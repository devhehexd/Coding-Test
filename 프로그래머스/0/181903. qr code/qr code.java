class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        for (int i = 0; i < code.length(); i++) {
            int index = i % q;
            if (index == r) {
                answer += code.charAt(i);
            }
        }
        return answer;
    }
}