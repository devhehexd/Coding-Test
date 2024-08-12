class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int numberProgressing = 1;
        int rowStart = 0;
        int rowEnd = n - 1;
        int columnStart = 0;
        int columnEnd = n - 1;

        while (numberProgressing <= n * n) {

            for (int i = columnStart; i <= columnEnd; i++) {
                answer[rowStart][i] = numberProgressing;
                numberProgressing++;
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                answer[i][columnEnd] = numberProgressing;
                numberProgressing++;
            }
            columnEnd--;

            for (int i = columnEnd; i >= columnStart; i--) {
                answer[rowEnd][i] = numberProgressing;
                numberProgressing++;
            }
            rowEnd--;

            for (int i = rowEnd; i >= rowStart; i--) {
                answer[i][columnStart] = numberProgressing;
                numberProgressing++;
            }
            columnStart++;
        }
        return answer;
    }
}