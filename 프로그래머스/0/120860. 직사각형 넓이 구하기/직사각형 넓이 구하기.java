class Solution {
    public int solution(int[][] dots) {
        int width = 0;
        int height = 0;
        int x1 = 0, x2 = 0, y1 = 0, y2 = 0;

        for (int i = 1; i < dots.length; i++) {
            if (dots[0][1] == dots[i][1]) {
                x2 = Math.max(dots[0][0], dots[i][0]);
                x1 = Math.min(dots[0][0], dots[i][0]);
            }
            if (dots[0][0] == dots[i][0]) {
                y2 = Math.max(dots[0][1], dots[i][1]);
                y1 = Math.min(dots[0][1], dots[i][1]);
            }
        }
        width = x2 - x1;
        height = y2 - y1;
        
        return width * height;
    }
}