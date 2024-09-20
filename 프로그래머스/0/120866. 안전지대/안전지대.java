class Solution {
    public int solution(int[][] board) {
        int[] x = {0, 0, -1, 1, -1, -1, 1, 1};
        int[] y = {-1, 1, 0, 0, -1, 1, -1, 1};

        int n = board.length;
        int m = board[0].length;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    for (int k = 0; k < 8; k++) {
                        int dx = j + x[k];
                        int dy = i + y[k];

                        if (-1 < dy && dy < n && -1 < dx && dx < m && board[dy][dx] != 1) {
                            board[dy][dx] = 2;
                        }
                    }
                }
            }
        }

        int zeroCounter = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    zeroCounter++;
                }
            }
        }
        return zeroCounter;
    }
}