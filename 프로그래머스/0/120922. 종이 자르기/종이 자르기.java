class Solution {
    public int solution(int M, int N) {
        int rowCount = 0;
        int columnCount = 0;

        for (int i = M; i > 1; i--) {
            rowCount++;
        }

        for (int i = N; i > 1; i--) {
            columnCount++;
        }
        return rowCount + (columnCount * M);
    }
}