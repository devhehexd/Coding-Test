class Solution {
    public int solution(int num, int k) {
        int answer = -1;

        String numStr = String.valueOf(num);
        
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) - '0' == k) {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
}