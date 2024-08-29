class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int n = i; n <= j; n++) {
            String tmp = String.valueOf(n);
            for (int m = 0; m < tmp.length(); m++) {
                if (tmp.charAt(m) == (char) (k + '0')) {
                    answer++;
                }
            }
        }
        return answer;
    }
}