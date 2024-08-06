class Solution {
    public int solution(String[] strArr) {
        int answer = 0;

            int[] strLength = new int[strArr.length];

            for (int i = 0; i < strLength.length; i++) {
                strLength[i] = strArr[i].length();
            }

            for (int i = 1; i <= 30; i++) {
                int sameNumCount = 0;
                for (int j = 0; j < strLength.length; j++) {
                    if (i == strLength[j]) {
                        sameNumCount++;
                    }
                }
                int tmp = sameNumCount;
                if (tmp > answer) {
                    answer = tmp;
                }
            }
            return answer;
    }
}