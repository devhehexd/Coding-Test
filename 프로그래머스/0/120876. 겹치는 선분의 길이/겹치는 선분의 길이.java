class Solution {
    public int solution(int[][] lines) {
        int answer = 0;

        int[] totalLength = new int[201];

        for (int[] i : lines) {
            int start = i[0] + 100;
            int end = i[1] + 100;

            for (int j = start; j < end; j++) {
                totalLength[j] += 1;
            }
        }
        for (int i : totalLength) {
            if (i > 1) {
                answer++;
            }
        }
        return answer;
    }
}