class Solution {
    public int solution(int n) {
        int maxNum = 0;
        int start = 1;

        while (true) {

            int factorial = 1;

            for (int i = start; i > 0; i--) {
                factorial *= i;
            }
            if (factorial <= n && start > maxNum) {
                maxNum = start;
            }
            if (factorial >= n) {
                break;
            }
            start++;
        }
        return maxNum;
    }
}