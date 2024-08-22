class Solution {
    public int solution(int n) {
        int answer = 0;

        String num = String.valueOf(n);

        for (int i = 0; i < num.length(); i++) {
            int tmp = num.charAt(i) - '0';
            answer += tmp;
        }
        return answer;
    }
}