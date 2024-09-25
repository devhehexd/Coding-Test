class Solution {
    public int solution(int n) {
        int compositeNumCount = 0;

        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count >= 3) {
                compositeNumCount++;
            }
        }
        return compositeNumCount;
    }
}