class Solution {
    public int solution(int n, int t) {
        
            int hour = 1;

            while (hour <= t) {

                n = n * 2;
                hour++;
            }
            return n;
    }
}